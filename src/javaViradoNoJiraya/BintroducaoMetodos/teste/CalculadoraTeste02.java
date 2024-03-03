package src.javaViradoNoJiraya.BintroducaoMetodos.teste;

import src.javaViradoNoJiraya.BintroducaoMetodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTeste02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Insira dois números para saber sua multiplicação:");
        System.out.print("Digite o 1º número: ");
        int num1 = scan.nextInt();

        System.out.print("Digite o 2º número: ");
        int num2 = scan.nextInt();


        calculadora.multiplicaDoisNumeros(num1, num2);

    }
}
