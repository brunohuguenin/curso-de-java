package src.javaViradoNoJiraya.BintroducaoMetodos.teste;

import src.javaViradoNoJiraya.BintroducaoMetodos.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite dois números para saber sua divisão");
        System.out.print("1º  número: ");
        double num1 = scan.nextDouble();
        System.out.print("2º número: ");
        double num2 = scan.nextDouble();

        double  resultado =  calculadora.divideDoisNumeros(num1, num2);
        System.out.print("O resultado é igual a: " + resultado);


    }
}
