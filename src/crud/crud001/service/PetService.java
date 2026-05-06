package crud.crud001.service;

import crud.crud001.enums.Sexo;
import crud.crud001.enums.TipoAnimal;
import crud.crud001.model.Endereco;
import crud.crud001.model.Pet;
import crud.crud001.util.Constantes;
import crud.crud001.util.Validador;

import java.io.IOException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//Toda a lógica de CRUD e busca

public class PetService {

    // Lista em memória para armazenar pets cadastrados
    private List<Pet> pets = new ArrayList<>();
    private ArquivoService arquivoService = new ArquivoService();
    private Scanner entrada = new Scanner(System.in);


    public void cadastrarPet() {
        try {
            List<String> perguntas = arquivoService.leitorArquivo("C:\\Users\\mnz\\CODE\\JAVA\\main-java\\src\\crud\\crud001\\formulario.txt");
            if (perguntas.size() != 7) {
                System.out.println("Erro: formulario.txt deve ter 7 perguntas.");
                return;
            }

            // Coleta e valida cada campo, usando as perguntas lidas do arquivo
            String nome = coletarValidarNome(perguntas.get(0));
            TipoAnimal tipo = coletarValidarTipo(perguntas.get(1));
            Sexo sexo = coletarValidarSexo(perguntas.get(2));
            Endereco endereco = coletarValidarEndereco(perguntas.get(3));
            double idade = coletarValidarIdade(perguntas.get(4));
            double peso = coletarValidarPeso(perguntas.get(5));
            String raca = coletarValidarRaca(perguntas.get(6));

            // Monta o objeto Pet
            Pet pet = new Pet();
            pet.setNome(nome);
            pet.setTipo(tipo);
            pet.setSexo(sexo);
            pet.setEndereco(endereco);
            pet.setIdade(idade);
            pet.setPeso(peso);
            pet.setRaca(raca);

            // Adiciona à lista em memória
            pets.add(pet);
            System.out.println("Pet cadastrado com sucesso!");


        } catch (IOException e) {
            System.out.println("Erro ao ler formulário.txt: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Erro no cadastro: " + e.getMessage());
        }
    }

    // Validação de nome (Q1: obrigatório, apenas letras)
    private String coletarValidarNome(String pergunta) {
        while (true) {
            System.out.println(pergunta);
            String resposta = entrada.nextLine().trim();
            if (Validador.isNomeValido(resposta)) return resposta;
            System.out.println("Nome inválido! Apenas letras e espaços, não pode ser vazio.");
        }
    }

    // Validação de tipo (Q2: converte para enum TipoAnimal)
    private TipoAnimal coletarValidarTipo(String pergunta) {
        while (true) {
            System.out.println(pergunta);
            String resposta = entrada.nextLine().trim();
            try {
                return Validador.parseTipoAnimal(resposta);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Validação de sexo (Q3: converte para enum Sexo)
    private Sexo coletarValidarSexo(String pergunta) {
        while (true) {
            System.out.println(pergunta);
            String resposta = entrada.nextLine().trim();
            try {
                return Validador.parseSexo(resposta);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Validação de endereço (Q4: mapeia para os 4 campos de Endereco)
    private Endereco coletarValidarEndereco(String pergunta) {
        System.out.println(pergunta);
        System.out.println("Informe os dados separadamente:");

        String rua, bairro, cidade, numero;

        //Rua, obrigatório
        while (true) {
            System.out.println("Rua: ");
            rua = entrada.nextLine().trim();
            if (Validador.isCampoEnderecoValido(rua, true)) break;
            System.out.println("Rua é obrigatória!");
        }

        // Número (opcional, usa NAO_INFORMADO se vazio)
        System.out.println("Número: ");
        numero = entrada.nextLine().trim();
        if (numero.isEmpty()) numero = Constantes.NAO_INFORMADO;

        // Bairro (obrigatório)
        while (true) {
            System.out.println("Bairro: ");
            bairro = entrada.nextLine().trim();
            if (Validador.isCampoEnderecoValido(bairro, true)) break;
            System.out.println("Bairro é obrigatório!");
        }

        // Cidade (obrigatório)
        while (true) {
            System.out.println("Cidade: ");
            cidade = entrada.nextLine().trim();
            if (Validador.isCampoEnderecoValido(cidade, true)) break;
            System.out.println("Cudade é obrigatório!");
        }


        Endereco endereco = new Endereco(rua, bairro, cidade);
        endereco.setNumero(numero);
        return endereco;
    }

    // Validação de idade (Q5: aceita vírgula, range 0-20)
    private double coletarValidarIdade(String pergunta) {
        while (true) {
            System.out.println(pergunta);
            String resposta = entrada.nextLine().trim();
            try {
                return Validador.validarIdade(resposta);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Validação de peso (Q6: range 0.5-60)
    private double coletarValidarPeso(String pergunta) {
        while (true) {
            System.out.println(pergunta);
            String resposta = entrada.nextLine().trim();
            try {
                return Validador.validarPeso(resposta);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Validação de raça (Q7: opcional, apenas letras)
    private String coletarValidarRaca(String pergunta) {
        while (true) {
            System.out.println(pergunta);
            String resposta = entrada.nextLine().trim();
            if (Validador.isRacaValida(resposta)) {
                return resposta.isEmpty() ? Constantes.NAO_INFORMADO : resposta;
            }
            System.out.println("Raça inválida! Apenas letras e espaços.");
        }
    }

    // Getter para lista de pets (usado em listagem/edição/exclusão)
    public List<Pet> getPets() {
        return pets;
    }


    public List<Pet> buscarPets(TipoAnimal tipo, Map<String, String> filtros){
        List<Pet> todosPets = arquivoService.listarTodosPets();

        return todosPets.stream()
                .filter(pet -> pet.getTipo() == tipo)
                .filter(pet -> aplicarFiltros(pet, filtros))
                .toList();
    }

    private boolean aplicarFiltros(Pet pet, Map<String, String> filtros) {

        for (Map.Entry<String, String> entry : filtros.entrySet()) {
            String chave = entry.getKey();
            String valor = normalizar(entry.getValue());

            switch (chave) {

                case "nome":
                    String nomePet = normalizar(pet.getNome());
                    if (!nomePet.contains(valor)) return false;
                    break;

                case "sexo":
                    if (!pet.getSexo().name().equalsIgnoreCase(valor)) return false;
                    break;

                case "idade":
                    double idade = Double.parseDouble(valor);
                    if (pet.getIdade() != idade) return false;
                    break;

                case "peso":
                    double peso = Double.parseDouble(valor);
                    if (pet.getPeso() != peso) return false;
                    break;

                case "raca":
                    String raca = normalizar(pet.getRaca());
                    if (!raca.contains(valor)) return false;
                    break;

                case "endereco":
                    String endereco = normalizar(
                            pet.getEndereco().getRua() + " " +
                                    pet.getEndereco().getBairro() + " " +
                                    pet.getEndereco().getCidade()
                    );
                    if (!endereco.contains(valor)) return false;
                    break;
            }
        }

        return true;
    }

    public String normalizar(String texto) {
        if (texto == null) return "";

        String semAcento = Normalizer.normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

        return semAcento.toLowerCase();
    }

}
