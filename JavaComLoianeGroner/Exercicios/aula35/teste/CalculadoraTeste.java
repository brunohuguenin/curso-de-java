package JavaComLoianeGroner.Exercicios.aula35.teste;

import JavaComLoianeGroner.Exercicios.aula35.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(Calculadora.fibonacci(i) + " ");
        }
    }
}
