package academy.devdojo.mainjava.javacore.Kenumeracao.domain;

public enum TipoCliente {
    //Atributos como se fossem constante, static

    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");
    public final int VALOR;
    private String nomeRelatorio;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }
    //Dessa forma o retorno da cosntante(enum) se dá atravez do atributo que você escolher (nomeRelatorio no caso)
    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.getNomeRelatorio().equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;

    }

    public int getVALOR() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

}
