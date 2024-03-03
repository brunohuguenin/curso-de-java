package src.javaViradoNoJiraya.BintroducaoMetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int a, int b) {
        System.out.printf("A multiplicação entre %d e %d é igual a %d", a, b, a * b);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
        return num1 / num2;
        }
    }

    public void imprimeDivisaoDeDoisNumeross(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("\nDentro do alteraNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArray(int[]numeros) {
        int soma = 0;
        for( int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int ...numeros){
        int soma = 0;
        for( int num: numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
