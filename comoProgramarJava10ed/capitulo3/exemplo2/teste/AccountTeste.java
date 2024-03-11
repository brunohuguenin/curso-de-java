package comoProgramarJava10ed.capitulo3.exemplo2.teste;

import comoProgramarJava10ed.capitulo3.exemplo2.dominio.Account;

import java.util.Scanner;

public class AccountTeste {
    public static void main(String[] args) {
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // exibe saldo inicial de cada objeto
        System.out.printf("%s balance: %.2f\n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f \n", account2.getName(), account2.getBalance());

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: "); // prompt
        double depositAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("\nadding %.2f to account1 balance", depositAmount);
        account1.deposit(depositAmount); // adiciona o saldo de account1ÿ

        // exibe os saldos
        System.out.printf("\n%s balance: %.2f \n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: %.2f \n", account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: "); // prompt
        depositAmount = input.nextDouble(); // obtém a entrada do usuário
        System.out.printf("\nadding %.2f to account2 balance", depositAmount);
        account2.deposit(depositAmount); // adiciona ao saldo de account2ÿ

        // exibe os saldos
        System.out.printf("\n%s balance: %.2f \n", account1.getName(),account1.getBalance());
        System.out.printf("%s balance: %.2f\n", account2.getName(),account2.getBalance());
    }
}
