package introducao;
// operador ternário
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 6000;

        /*String mensagemDoar = "Irei doar R$500,00!!";
        String mensagemNaoDoar = "Não irei doar, sem condições";*/
        String resultado = salario > 5000 ? "Irei doar R$500,00!!" : "Não irei doar, sem condições";
        System.out.println(resultado);
    }
}
