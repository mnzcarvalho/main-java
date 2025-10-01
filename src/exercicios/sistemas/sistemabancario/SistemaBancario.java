package exercicios.sistemas.sistemabancario;

public class SistemaBancario {
    public static void main(String[] args) {
        try {
            Conta[] contas = new Conta[]{
                    new ContaCorrente(1001),
                    new ContaPoupanca(1002)
            };


            TipoConta tipo = TipoConta.buscarPorDescricao("conta corrente");
            System.out.println("Tipo encontrado: " + tipo.getDescricao());

            System.out.println("Total de contas criadas: " + Conta.getTotalContas());
            System.out.println("Info tributação: " + Tributavel.getInfoTributacao());

            processarContas(contas);

            testarExcecoes(contas[0]);
            testarExcecoes(contas[1]);

            testarInstanceOf(contas);


        } catch (Exception e) {
            System.err.println("Erro no sistema: " + e.getMessage());
        }
    }

    public static void processarContas(Conta[] contas) {
        for (Conta conta : contas) {
            try {
                conta.depositar(1000);
                System.out.println(conta.toString());

                if (conta instanceof Tributavel) {
                    Tributavel tributavel = (Tributavel) conta;
                    System.out.println("Tributo: R$ " + tributavel.calcularTributo());
                }

                if (conta instanceof Rentavel) {
                    Rentavel rentavel = (Rentavel) conta;
                    System.out.println("Rendimento: R$ " + rentavel.calcularRendimento());
                }

            } catch (IllegalArgumentException e) {
                System.err.println("Erro de argumento: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Erro geral: " + e.getMessage());
            }
        }
    }

    public static void testarExcecoes(Conta conta) {
        try {
            conta.sacar(5000);
        } catch (SaldoInsuficienteException e) {
            System.err.println("Exceção checked: " + e.getMessage());
        } catch (LimiteExcedidoException e) {
            System.err.println("Execeção unckecked: " + e.getMessage());
        }
    }

    public static void testarInstanceOf(Conta[] contas) {
        for (Conta conta : contas) {
            if (conta instanceof ContaCorrente) {
                ContaCorrente cc = (ContaCorrente) conta;
                System.out.println("É Conta Corrente - Tributo: " + cc.calcularTributo());
            } else if (conta instanceof ContaPoupanca) {
                ContaPoupanca cp = (ContaPoupanca) conta;
                System.out.println("É conta Poupança - Rendimento: " + cp.calcularRendimento());
            }
        }
    }
}
