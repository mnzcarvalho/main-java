package academy.devdojo.mainjava.introducao;
/*
Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salario>, na data: <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Eduardo";
        String endereco = "Sítio retiro";
        double salario = 3000.00;
        String dataRecebimentoSalario = "10/10/10";
        String relatorio = "Eu "+nome+", morando no endereço: "+endereco+
                ", confirmo que recebi o salário de R$"+salario+", na data: "+ dataRecebimentoSalario;
        System.out.println(relatorio);
    }
}
