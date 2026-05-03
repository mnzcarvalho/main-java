package crud.crud001.service;

import java.util.Scanner;

//exibição e captura das opções
public class MenuService {
    private PetService petService;
    private Scanner entrada = new Scanner(System.in);
    private int opcao;

    public MenuService(PetService petService) {
        this.petService = petService;
    }

    private int lerOpcaoValida() {
        while (true) {
            System.out.println("Digite um opção válida: ");
            if (entrada.hasNextInt()) {
                int op = entrada.nextInt();
                if (op >= 1 && op <= 6) {
                    entrada.hasNextLine();
                    return op;
                } else {
                    System.out.println("Opção inválida! Escolha um número de 1 a 6.");
                }
            } else {
                System.out.println("Entrada inválida, digite apenas números.");
                entrada.next();
            }
            entrada.nextLine();
        }
    }

    public void exibir() {

        do {
            System.out.println("===Sistema de Cadastro de Pets===");
            System.out.println("1- Cadastrar um novo pet");
            System.out.println("2- Alterar os dados do pet cadastrado");
            System.out.println("3- Deletar um pet cadastrado");
            System.out.println("4- Listar todos os pets cadastrados");
            System.out.println("5- Listar pets por algum critério (idade, nome, raça)");
            System.out.println("6- Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            opcao = lerOpcaoValida();

            switch (opcao) {
                case 1:
                    petService.cadastrarPet();
                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    entrada.close();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        }
        while (opcao != 6);
    }
}
