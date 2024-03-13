package JavaComLoianeGroner.Exercicios.aula34.teste;

import JavaComLoianeGroner.Exercicios.aula34.dominio.Calculadora;

import java.util.Scanner;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continuar;
        do {

            System.out.println("Escolha a operação que deseja realizar");
            System.out.print("1 - SOMAR\n2 - SUBTRAIR\n3 - MULTIPLICAR\n4 - DIVIDIR\n5 - POTENCIA\n");
            System.out.print("Opção: ");
            int opcao = input.nextInt();
            if (opcao > 0 && opcao < 6) {
                System.out.print("Digite o primeiro valor: ");
                int valor1 = input.nextInt();
                System.out.print("Digite o segundo valor: ");
                int valor2 = input.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.printf("%d + %d = %d", valor1, valor2, Calculadora.somar(valor1, valor2));
                        break;
                    case 2:
                        System.out.printf("%d - %d = %d", valor1, valor2, Calculadora.subtrair(valor1, valor2));
                        break;
                    case 3:
                        System.out.printf("%d * %d = %d", valor1, valor2, Calculadora.multiplicar(valor1, valor2));
                        break;
                    case 4:
                        System.out.printf("%d / %d = %d", valor1, valor2, Calculadora.dividir(valor1, valor2));
                        break;
                    case 5:
                        System.out.printf("%d ^ %d = %d", valor1, valor2, Calculadora.potencia(valor1, valor2));
                        break;
                }
            } else {
                System.out.println("Opção Inválida. Programa Encerrado");
                break;
            }
            System.out.print("\nDeseja Continuar?\nS - P/ SIM\nN- P/ NÃO\nContinuar: ");
            continuar = input.next();
        } while (continuar.equals("s"));
        System.out.println("Programa Encerrado");
    }
}
