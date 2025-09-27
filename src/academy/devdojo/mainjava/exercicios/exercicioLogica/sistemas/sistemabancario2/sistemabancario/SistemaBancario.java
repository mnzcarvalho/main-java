package academy.devdojo.mainjava.exercicios.exercicioLogica.sistemas.sistemabancario2.sistemabancario;

// 1. ENUMERAÇÃO
enum TipoConta {
    CORRENTE("Conta Corrente", 0.01) {
        @Override
        public String getDescricaoCompleta() {
            return "Tipo: " + this.getDescricao() + " - Taxa: " + this.getTaxa();
        }
    },
    POUPANCA("Conta Poupança", 0.05) {
        @Override
        public String getDescricaoCompleta() {
            return "Tipo: " + this.getDescricao() + " - Rendimento: " + this.getTaxa();
        }
    },
    SALARIO("Conta Salário", 0.0);

    private final String descricao;
    private final double taxa;

    // Construtor
    TipoConta(String descricao, double taxa) {
        this.descricao = descricao;
        this.taxa = taxa;
    }

    // Busca por descrição
    public static TipoConta buscarPorDescricao(String descricao) {
        for (TipoConta tipo : values()) {
            if (tipo.descricao.equalsIgnoreCase(descricao)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo de conta não encontrado: " + descricao);
    }

    // Método sobrescrito para alguns valores
    public String getDescricaoCompleta() {
        return descricao;
    }

    // Getters
    public String getDescricao() { return descricao; }
    public double getTaxa() { return taxa; }
}

// 2. CLASSE ABSTRATA
abstract class Conta {
    protected static int totalContas = 0; // STATIC

    protected final int numero; // FINAL - tipo referência
    protected double saldo;
    protected final TipoConta tipo; // FINAL

    // Bloco de inicialização STATIC
    static {
        System.out.println("Sistema Bancário Iniciado!");
    }

    // Construtor protegido (HERANÇA)
    protected Conta(int numero, TipoConta tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = 0.0;
        totalContas++;
    }

    // Métodos abstratos
    public abstract void aplicarTaxa();

    // Método final que não pode ser sobrescrito
    public final int getNumero() {
        return numero;
    }

    // Método com exceção
    public void depositar(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo");
        }
        this.saldo += valor;
    }

    // Método que lança exceção checked
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente: " + saldo);
        }
        this.saldo -= valor;
    }

    // STATIC method
    public static int getTotalContas() {
        return totalContas;
    }

    // SOBRESCRITA de toString
    @Override
    public String toString() {
        return String.format("Conta %d - Saldo: R$ %.2f - Tipo: %s",
                numero, saldo, tipo.getDescricao());
    }
}

// 3. EXCEÇÕES PERSONALIZADAS
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}

class LimiteExcedidoException extends RuntimeException {
    public LimiteExcedidoException(String message) {
        super(message);
    }
}

// 4. INTERFACES
interface Tributavel {
    double TAXA_BASE = 0.0038; // Atributo estático e final
    double calcularTributo();

    static String getInfoTributacao() {
        return "Sistema tributário brasileiro";
    }
}

interface Rentavel {
    double calcularRendimento();
}

// 5. CLASSES CONCRETAS COM HERANÇA
class ContaCorrente extends Conta implements Tributavel {
    private static final double LIMITE_SAQUE = 2000.0; // FINAL - tipo primitivo

    public ContaCorrente(int numero) {
        super(numero, TipoConta.CORRENTE);
    }

    // POLIMORFISMO: sobrescrita com parâmetro polimórfico
    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > LIMITE_SAQUE) {
            throw new LimiteExcedidoException("Limite de saque excedido: " + LIMITE_SAQUE);
        }
        super.sacar(valor);
    }

    @Override
    public void aplicarTaxa() {
        this.saldo -= 10.0; // Taxa de manutenção
    }

    // Implementação da interface
    @Override
    public double calcularTributo() {
        return this.saldo * TAXA_BASE;
    }
}

class ContaPoupanca extends Conta implements Rentavel {
    public ContaPoupanca(int numero) {
        super(numero, TipoConta.POUPANCA);
    }

    @Override
    public void aplicarTaxa() {
        // Poupança não tem taxa
    }

    @Override
    public double calcularRendimento() {
        return this.saldo * tipo.getTaxa();
    }

    // Método específico da poupança
    public void aplicarRendimento() {
        this.saldo += calcularRendimento();
    }
}

// 6. CLASSE PRINCIPAL PARA TESTAR
public class SistemaBancario {
    public static void main(String[] args) {
        try {
            // POLIMORFISMO: usando a classe base como tipo
            Conta[] contas = new Conta[]{
                    new ContaCorrente(1001),
                    new ContaPoupanca(1002)
            };

            // TESTANDO TODOS OS CONCEITOS:

            // 1. ENUMERAÇÃO
            System.out.println("=== ENUMERAÇÃO ===");
            TipoConta tipo = TipoConta.buscarPorDescricao("Conta Corrente");
            System.out.println("Tipo encontrado: " + tipo.getDescricaoCompleta());

            // 2. POLIMORFISMO E PARÂMETROS POLIMÓRFICOS
            System.out.println("\n=== POLIMORFISMO ===");
            processarContas(contas);

            // 3. EXCEÇÕES
            System.out.println("\n=== EXCEÇÕES ===");
            testarExcecoes(contas[0]);

            // 4. INSTANCEOF E CAST
            System.out.println("\n=== INSTANCEOF E CAST ===");
            testarInstanceOf(contas);

            // 5. STATIC
            System.out.println("\n=== STATIC ===");
            System.out.println("Total de contas criadas: " + Conta.getTotalContas());
            System.out.println("Info tributação: " + Tributavel.getInfoTributacao());

        } catch (Exception e) {
            System.err.println("Erro no sistema: " + e.getMessage());
        }
    }

    // PARÂMETRO POLIMÓRFICO
    public static void processarContas(Conta[] contas) {
        for (Conta conta : contas) {
            try {
                // POLIMORFISMO: método se comporta diferente para cada tipo
                conta.depositar(1000.0);
                System.out.println(conta.toString()); // SOBRESCRITA de toString

                // INTERFACE - programação orientada a interface
                if (conta instanceof Tributavel) {
                    Tributavel tributavel = (Tributavel) conta; // CAST
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
            conta.sacar(5000.0); // Vai lançar exceção
        } catch (SaldoInsuficienteException e) {
            System.err.println("Exceção checked: " + e.getMessage());
        } catch (LimiteExcedidoException e) {
            System.err.println("Exceção unchecked: " + e.getMessage());
        }
    }

    public static void testarInstanceOf(Conta[] contas) {
        for (Conta conta : contas) {
            // INSTANCEOF
            if (conta instanceof ContaCorrente) {
                ContaCorrente cc = (ContaCorrente) conta; // CAST
                System.out.println("É Conta Corrente - Tributo: " + cc.calcularTributo());
            } else if (conta instanceof ContaPoupanca) {
                ContaPoupanca cp = (ContaPoupanca) conta;
                System.out.println("É Conta Poupança - Rendimento: " + cp.calcularRendimento());
            }
        }
    }
}