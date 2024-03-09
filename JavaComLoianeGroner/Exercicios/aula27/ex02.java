package JavaComLoianeGroner.Exercicios.aula27;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente();
        conta.numero = "32578-66";
        conta.agencia = "3668";
        conta.especial = true;
        conta.valorEspecialUsado = 0;
        conta.limiteEspecial = 750;
        conta.saldo = 638.86;


        System.out.println("\n==== BEM-VINDO A SUA CONTA BANCÁRIA ===");
        System.out.println("Digite os seguinte números para realizar uma operação:");
        System.out.print("1 - Verificar o saldo\n2 - Depositar\n3 - Sacar\nOpção: ");
        int opcao = scan.nextInt();

        if (opcao < 0 || opcao > 3) {
            System.out.println("Opção inválida. Encerrando o programa!");
        } else {
            switch (opcao) {
                case 1:
                    System.out.println("\nSaldo da conta atual da conta " + conta.numero + " = R$" + conta.saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor que deseja depositar: R$ ");
                    double valorDepositado = scan.nextDouble();
                    conta.depositarDinheiro(valorDepositado);
                    double valorAtualizado = conta.saldo;
                    System.out.println("Saldo depois do deposito: R$ " + valorAtualizado);
                    break;
                case 3:
                    System.out.print("Quando deseja sacar: R$ ");
                    double valorSaque = scan.nextDouble();
                    boolean saqueEfetuado = conta.reaLizarSaque(valorSaque);
                    if (saqueEfetuado) {
                        System.out.println("Saque efetuado com sucesso!");
                        System.out.println("Saldo atual da conta = R$" + conta.saldo);
                    } else {
                        System.out.println("Não foi possível realizar o saque. Saldo insuficiente!");
                    }
            }
        }




    }
}
