package comoProgramarJava10ed.capitulo3.teste;

import comoProgramarJava10ed.capitulo3.dominio.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // cria um objeto Account e o atribui a myAccount
        Account myAccount = new Account();

        // exibe o valor inicial do nome (null)
        System.out.printf("Initial name is: %s", myAccount.getName());

        // solicita e lê o nome
        System.out.println("\nPlease enter the name: ");
        String theName = input.nextLine();
        myAccount.setName(theName); // insere theName em myAccount
        System.out.println();

        // exibe o nome armazenado no objeto myAccount

        System.out.printf("Name in object myAccount is: %s", myAccount.getName());
    }
}
