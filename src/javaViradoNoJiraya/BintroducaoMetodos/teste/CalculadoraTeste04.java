package src.javaViradoNoJiraya.BintroducaoMetodos.teste;

import src.javaViradoNoJiraya.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;


        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("\nDentro do CalculadoraTeste04:");
        System.out.println(num1);
        System.out.println(num2);

    }
}
