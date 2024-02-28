package src.javaViradoNoJiraya.introducao;

public class aula05 {
    public static void main(String[] args) {
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter em breve";
        //String resultado;

        /*
        if (salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }*/

        String resultado = salario > 10000? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
