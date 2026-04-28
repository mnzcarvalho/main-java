# Estrutura de pacotes e classes (modelagem OO)

Antes de codificar, defina a arquitetura. Sugestão:

- **model** → Pet, Endereco
- **enums** → TipoAnimal (CACHORRO, GATO), Sexo (MACHO, FEMEA)
- **service** → PetService (toda lógica de CRUD e busca), ArquivoService (leitura/escrita de arquivos), MenuService (exibição e captura de opções)
- **util** → Validador (métodos estáticos para validação de nome, peso, idade, etc.) e Constantes (ex: NAO_INFORMADO = "NÃO INFORMADO")
- **app** → Main (loop principal, orquestração)

---

# 2. Passo a passo de implementação

## Passo 1 – Leitura do formulário

- Crie o arquivo formulario.txt com as 7 perguntas, uma por linha.
- Crie um método em ArquivoService que leia todas as linhas e retorne uma List<String>.
- No início do programa, chame esse método e imprima as perguntas no terminal.
- Não use System.out.println com perguntas fixas; sempre leia do arquivo.

---

## Passo 2 – Menu inicial

- Crie um loop while que exibe o menu com 6 opções.
- Use MenuService para exibir e capturar a entrada do usuário.
- Valide a entrada: apenas números de 1 a 6.
- Trate NumberFormatException caso o usuário digite letras.

---

## Passo 3 – Cadastro de um pet

- Ao escolher a opção 1, leia novamente as perguntas do arquivo (ou reutilize).
- Para cada pergunta, solicite a resposta do usuário.

### Validações

- **Nome e sobrenome**
  - obrigatório
  - apenas letras (\p{L})

- **Tipo e Sexo**
  - converter para enums
  - tratar inválidos

- **Endereço**
  - rua, número, bairro, cidade
  - número pode ser NÃO INFORMADO

- **Idade**
  - aceitar vírgula ou ponto
  - converter para double
  - < 1 ano → 0.x
  - erro se > 20

- **Peso**
  - converter para double
  - erro se < 0.5 ou > 60

- **Raça**
  - apenas letras

### Regras gerais

- Nome vazio → erro
- Campos opcionais → usar NAO_INFORMADO
- Monte o objeto Pet

---

## Passo 4 – Salvar em arquivo

- Criar método em ArquivoService que recebe um Pet
- Nome do arquivo:

  yyyyMMdd'T'HHmm-NOME+SOBRENOME.TXT

- Garantir que a pasta petsCadastrados exista
- Salvar:
  - uma linha por campo
  - sem perguntas
  - endereço em linha única

---

## Passo 5 – Buscar pet(s) (Opção 5)

### Fluxo

1. Escolher tipo de animal (obrigatório)
2. Escolher até 2 critérios adicionais:
  - nome/sobrenome
  - sexo
  - idade
  - peso
  - raça
  - endereço

3. Solicitar valores
4. Ler arquivos da pasta
5. Converter para objetos Pet

### Regras

- Nome → busca parcial (contains)
- Case-insensitive
- Remover acentos com Normalizer

### Exibição

- Resultados numerados e formatados

---

## Passo 6 – Alterar um pet (Opção 2)

### Fluxo

1. Buscar pet
2. Exibir lista numerada
3. Selecionar índice

### Alterações

- Não alterar tipo e sexo
- Para cada campo:
  - mostrar valor atual
  - permitir alteração
  - vazio mantém valor

### Salvamento

- Sobrescrever arquivo
- Opcional: renomear se nome mudar

---

## Passo 7 – Deletar um pet (Opção 3)

### Fluxo

1. Buscar
2. Selecionar
3. Confirmar (SIM/NÃO)
4. Deletar arquivo

---

## Passo 8 – Sair

- Opção 6 encerra o programa

---

# 3. Persistência e leitura de arquivos

- Ler arquivos sob demanda (recomendado para prática de I/O)

### Método sugerido

    Pet fromFile(File arquivo)

### I/O

- Escrita → BufferedWriter
- Leitura → BufferedReader

### Formato

1. Nome
2. Tipo
3. Sexo
4. Endereço
5. Idade (ex: 6 anos)
6. Peso (ex: 5kg)
7. Raça

- Remover sufixos ao ler

---

# 4. Tratamento de exceções

- Criar:
  - ValidacaoException
  - PetNaoEncontradoException

- No menu:
  - capturar erros
  - exibir mensagens amigáveis

---

# 5. Constantes

    public static final String NAO_INFORMADO = "NÃO INFORMADO";
    public static final String FORMULARIO_PATH = "formulario.txt";
    public static final String PASTA_PETS = "petsCadastrados";

---

# 6. Ferramentas e dicas

- Data e hora: LocalDateTime + DateTimeFormatter
- Remover acentos: Normalizer.normalize(texto, Normalizer.Form.NFD);
- Entrada de dados: Scanner

## Separação de responsabilidades

- MenuService → interação com usuário
- PetService → regras de negócio
- ArquivoService → manipulação de arquivos
- Main → controle do fluxo

---

# 7. Ordem sugerida de codificação

1. Criar classes de modelo e enums
2. Implementar ArquivoService
3. Criar Validador e Constantes
4. Criar Main com cadastro
5. Implementar listagem de todos
6. Implementar busca
7. Implementar alterar e deletar
8. Refinar validações
9. Testar todos os cenários  