package comoProgramarJava10ed.capitulo3.exemplo3;

import javax.swing.*;

public class Dialog1 {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Welcome to Java");

        // pede ao usuário inserir seu nome
        String name = JOptionPane.showInputDialog("What's your name?");

        // cria a mensagem
        String message = String.format("Welcome, %s, to Java Programming!", name);

        // exibe a mensagem para cumprimentar o usuário pelo nome
        JOptionPane.showMessageDialog(null, message);

    }
}
