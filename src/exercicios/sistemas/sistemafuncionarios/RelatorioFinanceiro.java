package exercicios.sistemas.sistemafuncionarios;

public class RelatorioFinanceiro {
    public static void exibirFolhaPagamento(Funcionario[] funcionarios) throws BonusException {

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Bonus do funcionário " + funcionario.getNome() + " é de: " + (funcionario.getSalario() +funcionario.calcularBonus()));
        }

    }
}
