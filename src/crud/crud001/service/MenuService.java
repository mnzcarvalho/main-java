package crud.crud001.service;

import crud.crud001.enums.TipoAnimal;
import crud.crud001.model.Pet;

import java.util.Map;
import java.util.Scanner;

public class MenuService {
    private PetService petService;
    private Scanner sc;

    public MenuService(PetService petService) {
        this.petService = petService;
        this.sc = new Scanner(System.in);
    }

    public void exibir() {
        int opcao = -1;
        while (opcao != 6) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar Pet");
            System.out.println("2 - Alterar Pet");
            System.out.println("3 - Deletar Pet");
            System.out.println("4 - Listar todos os Pets");
            System.out.println("5 - Buscar Pet");
            System.out.println("6 - Sair");
            System.out.print("Opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Erro: digite apenas números de 1 a 6.");
                continue;
            }

            switch (opcao) {
                case 1: petService.cadastrar(sc); break;
                case 2: petService.alterar(sc); break;
                case 3: petService.deletar(sc); break;
                case 4: petService.listarTodos(); break;
                case 5: buscar(sc); break;
                case 6: System.out.println("Saindo..."); break;
                default: System.out.println("Erro: opção inválida. Digite 1 a 6.");
            }
        }
        sc.close();
    }

    private void buscar(Scanner sc) {
        try {
            System.out.print("Tipo (CACHORRO/GATO): ");
            TipoAnimal tipo;
            try {
                tipo = TipoAnimal.valueOf(sc.nextLine().trim().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Tipo inválido.");
                return;
            }

            Map<String, String> criterios = new java.util.HashMap<>();
            System.out.print("Quantos critérios adicionais (0-2)? ");
            int qtd;
            try {
                qtd = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) { qtd = 0; }

            for (int i = 0; i < Math.min(qtd, 2); i++) {
                System.out.print("Critério (nome/sexo/idade/peso/raca/endereco): ");
                String chave = sc.nextLine().trim().toLowerCase();
                System.out.print("Valor: ");
                String valor = sc.nextLine().trim();
                criterios.put(chave, valor);
            }

            PetSearch search = new PetSearchService();
            java.util.List<Pet> resultados = search.buscar(tipo, criterios);
            System.out.println(search.formatarResultados(resultados));

        } catch (Exception e) {
            System.out.println("Erro na busca: " + e.getMessage());
        }
    }
}
