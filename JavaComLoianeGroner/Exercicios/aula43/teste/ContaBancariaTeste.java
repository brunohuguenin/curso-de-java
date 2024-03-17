package JavaComLoianeGroner.Exercicios.aula43.teste;

import JavaComLoianeGroner.Exercicios.aula43.dominio.ContaBancaria;
import JavaComLoianeGroner.Exercicios.aula43.dominio.ContaPoupanca;

import java.util.Scanner;

public class ContaBancariaTeste {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca();

        Scanner input = new Scanner(System.in);

        System.out.println(" ===== CONTA POUPANÇA ==== ");
        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = input.nextLine();
        contaPoupanca.setNomeCliente(nomeCliente);

        System.out.println("Digite o número da Conta: ");
        String numConta = input.nextLine();
        contaPoupanca.setNumConta(numConta);

        System.out.printf("\nSeja Bem-Vindo, %s\nSeu saldo atual é de R$ %.2f.\n", nomeCliente, contaPoupanca.getSaldo());


        int opcao = 0;
        String continuar = "";

        do {
            System.out.print("Selecione uma de nossas operações\n1 - DEPOSITAR\n2 - SACAR\n3 - VALOR DO SALDO + RENDIMENTO\nOPÇÃO: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nValor a ser depositado R$ ");
                    double valorDep = input.nextDouble();
                    contaPoupanca.depositar(valorDep);
                    System.out.printf("Seu saldo atual é de R$ %.2f", contaPoupanca.getSaldo());

                    break;
                case 2:
                    System.out.println("\nValor que deseja sacar R$ ");
                    double valorSaque = input.nextDouble();
                    contaPoupanca.sacar(valorSaque);
                    System.out.printf("\nSeu saldo atual é de R$ %.2f", contaPoupanca.getSaldo());
                    break;
                case 3:
                    contaPoupanca.calcularNovoSaldo(0.3);
                    System.out.printf("Rendimento aplicado, novo saldo é de R$ %.2f", contaPoupanca.getSaldo());
            }
            System.out.println();

            System.out.print("Deseja continuar?\nS - SIM\nN = NÃO: ");
            continuar = input.next();
            System.out.println();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("Programa Finalizado!");
    }
}
