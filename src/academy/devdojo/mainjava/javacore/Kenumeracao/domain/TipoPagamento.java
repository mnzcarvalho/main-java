package academy.devdojo.mainjava.javacore.Kenumeracao.domain;

//padrão de projeto strategy
public enum TipoPagamento{
        DEBITO{
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };
        //o metodo em sí não vai ter comportamento, vai ser decicido pelas enumerações que irão sobrescrever
        // ele tem q ser sobrescrito
        public abstract double calcularDesconto (double valor);

    }