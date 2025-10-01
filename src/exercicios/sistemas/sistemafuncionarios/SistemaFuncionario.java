package exercicios.sistemas.sistemafuncionarios;

public class SistemaFuncionario {
    public static void main(String[] args) throws BonusException {
        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Gerente("Jão", 19999, Departamento.TI, "5");
        funcionarios[1] = new Desenvolvedor("Zé", 9999, Departamento.TI, "3", "Java");
        funcionarios[2] = new Estagiario("Junin", 1000, Departamento.TI, "7", 20);

        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();

            if (funcionario instanceof Trabalhavel) {
                ((Trabalhavel) funcionario).realizarTarefas();
            }

            try {
                System.out.println("Bonus: R$" + funcionario.calcularBonus());
            } catch (BonusException e){
                e.printStackTrace();
            }
            System.out.println("---");
        }

        RelatorioFinanceiro.exibirFolhaPagamento(funcionarios);
    }
}
