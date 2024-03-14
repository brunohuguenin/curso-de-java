package JavaComLoianeGroner.Exercicios.aula35.teste;

import JavaComLoianeGroner.Exercicios.aula35.dominio.Somatorio;

import java.util.Scanner;

public class SomatorioTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor N para saber o somatório de 1 até N: ");
        int valorN = input.nextInt();

        System.out.printf("\nO somatório de 1 até %d é igual a : %d", valorN, Somatorio.somarAte(valorN));
    }
}
