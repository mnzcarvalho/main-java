package exercicios.review.a.domain;

public class Emprestimo {
    private Material material;
    private String dataEmprestimo;
    private String dataDevolucao;

    public void registrarEmprestimo(Material material, String dataEmprestimo){
        this.material = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = null;
    }

   public String exibirEmprestimo(){
        if (material == null){
            return "Nenhum empréstimo registrado.";
        }

        return "Material: " + material.getTitulo() +
                "\nData do Empréstimo: " + dataEmprestimo +
                "\nData de dataDevolucao" + (dataDevolucao != null ? dataDevolucao : "Ainda não devolvido");
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
