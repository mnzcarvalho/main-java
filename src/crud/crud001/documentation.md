# PetCRUD - Documentação da Arquitetura

## Por que esta estrutura?

### 1. Enums (`TipoAnimal`, `Sexo`)
- **Type safety**: Evita strings soltas. `TipoAnimal.CACHORRO` é compilado, não compara "cachorro" vs "Cachorro".
- **Refatoração segura**: IDE renomeia enum, não esquece strings espalhadas.
- **Validação implícita**: `valueOf()` já valida entrada.

### 2. Model (`Pet`, `Endereco`)
- **Encapsulamento**: Dados + comportamento juntos.
- **TDA (Table Data Access)**: `Pet` sabe salvar/carregar a si próprio (`savePet()`, `loadPet()`). Simplifica: quem usa `Pet` não precisa saber de `ArquivoService`.
- **Coesão**: `Endereco` isola lógica de endereço (rua, número, bairro, cidade).

### 3. Service (`ArquivoService`, `PetService`, `PetSearchService`, `MenuService`)
- **SRP (Single Responsibility Principle)**:
  - `ArquivoService`: Apenas I/O de arquivos (implementa `PetRepository`).
  - `PetService`: Regras de negócio (cadastro, alteração, deleção) - orquestração.
  - `PetSearchService`: Busca e filtros (implementa `PetSearch`).
  - `MenuService`: Interação com usuário (Scanner, menu).
- **DIP (Dependency Inversion Principle)**: `PetService` recebe `PetRepository` e `PetSearch` via construtor. Não depende de classes concretas.

### 4. Interfaces (`PetRepository`, `PetSearch`)
- **Baixo acoplamento**: Troca implementação (ex: `ArquivoService` → `DatabaseService`) sem mudar `PetService`.
- **OCP (Open/Closed Principle)**: `PetSearchService` usa `Map<String, Predicate>` para critérios de busca. Novos critérios = novo `put()` no map, não mexe no `switch`.

### 5. Util (`Validador`, `Constantes`)
- **Reutilização**: Validações e constantes em um só lugar.
- **SRP**: `Validador` só valida, não faz I/O.

---

## Por que cada classe?

| Classe | Responsabilidade |
|--------|-------------------|
| `Pet` | Modelo de dados + TDA (save/load) |
| `Endereco` | Modelo de endereço (rua, número, bairro, cidade) |
| `TipoAnimal` | Enum: CACHORRO, GATO |
| `Sexo` | Enum: MACHO, FEMEA |
| `PetRepository` | Interface: contrato para persistência de pets |
| `PetSearch` | Interface: contrato para busca de pets |
| `ArquivoService` | Implementa `PetRepository` - I/O arquivos |
| `PetService` | Orquestra cadastro/alteração/deleção (SRP) |
| `PetSearchService` | Implementa `PetSearch` - busca/filtros |
| `MenuService` | Exibe menu, lê Scanner, chama `PetService` |
| `Validador` | Métodos estáticos de validação |
| `Constantes` | Constantes globais (PASTA_PETS, etc) |
| `Main` | Entry point - injeta dependências, inicia menu |

---

## Comentários para métodos (adicionar em cada classe)

### Pet.java
```java
// === TDA: savePet (salva a si próprio) ===
// Grava pet no arquivo usando generateFileName().
// Formato: 7 linhas (nome, tipo, sexo, endereço, idade, peso, raça).
public void savePet() throws IOException

// === TDA: generateFileName ===
// Gera nome do arquivo: yyyyMMdd'T'HHmm-NOME+SOBRENOME.TXT
// Usa timestamp atual + nome do pet.
public Path generateFileName()

// === TDA: loadPet (static) ===
// Carrega pet de arquivo. Faz parse das 7 linhas.
// Retorna null se arquivo inválido ou erro de parse.
public static Pet loadPet(Path arquivo) throws IOException

// Getters/Setters: acesso aos campos do pet.
```

### ArquivoService.java (implementa PetRepository)
```java
// Salva pet usando TDA (pet.savePet()).
// Implementação de PetRepository.salvarPet().
public void salvarPet(Pet pet) throws IOException

// Lista todos os pets da pasta petsCadastrados.
// Lê cada .txt, converte para Pet via Pet.loadPet().
// Implementação de PetRepository.listarTodos().
public List<Pet> listarTodos() throws IOException

// Lê pet de arquivo específico.
// Implementação de PetRepository.lerDoArquivo().
public Pet lerDoArquivo(Path arquivo) throws IOException
```

### PetService.java
```java
// Cadastra novo pet: lê perguntas do formulário, coleta respostas via Scanner,
// valida campos, cria objeto Pet, salva via repository.
public void cadastrar(Scanner sc)

// Lista todos os pets cadastrados usando repository.listarTodos(),
// formata com search.formatarResultados().
public void listarTodos()

// Altera pet existente: lista pets, usuário seleciona índice,
// permite alterar campos (vazio = manter), salva sobrepondo arquivo.
// Tipo e Sexo não podem ser alterados (Passo 6 do guide).
public void alterar(Scanner sc)

// Deleta pet: lista pets, usuário seleciona, confirma (SIM/NÃO),
// deleta arquivo da pasta petsCadastrados.
public void deletar(Scanner sc)
```

### PetSearchService.java (implementa PetSearch)
```java
// Busca pets por tipo (obrigatório) e até 2 critérios adicionais.
// Critérios: nome, sexo, idade, peso, raça, endereço.
// Usa Normalizer para remover acentos (case-insensitive).
// Implementação de PetSearch.buscar().
public List<Pet> buscar(TipoAnimal tipo, Map<String,String> criterios) throws IOException

// Verifica se pet atende aos critérios de busca.
// Usa containsIgnoreAccents() para nome/raça/endereço.
private boolean matches(Pet p, Map<String,String> criterios)

// Verifica se source contém query, ignorando acentos e case.
private boolean containsIgnoreAccents(String source, String query)

// Normaliza string: remove acentos via Normalizer.
private String normalize(String s)

// Formata lista de pets para exibição numerada e formatada.
// Implementação de PetSearch.formatarResultados().
public String formatarResultados(List<Pet> pets)
```

### MenuService.java
```java
// Exibe menu principal (loop 1-6), lê opção do usuário,
// chama métodos de petService correspondentes.
public void exibir()

// Executa fluxo de busca (Passo 5): lê tipo, critérios,
// chama PetSearchService.buscar(), exibe resultados.
private void buscar(Scanner sc)
```

### Validador.java
```java
// Valida nome/sobrenome: obrigatório, apenas letras e espaços.
public static boolean validarNomeSobrenome(String nome)

// Converte string para TipoAnimal. Retorna null se inválido.
public static TipoAnimal parseTipo(String input)

// Converte string para Sexo. Retorna null se inválido.
public static Sexo parseSexo(String input)

// Valida idade: deve estar entre 0 e 20 (inclusive).
public static boolean validarIdade(double idade)

// Valida peso: deve estar entre 0.5 e 60 (inclusive).
public static boolean validarPeso(double peso)

// Valida raça: se vazio = ok (opcional), senão apenas letras.
public static boolean validarRaca(String raca)
```
