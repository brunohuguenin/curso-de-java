package JavaComLoianeGroner.Exercicios.aula36.teste;

import JavaComLoianeGroner.Exercicios.aula36.dominio.Agenda;
import JavaComLoianeGroner.Exercicios.aula36.dominio.Contato;

import java.util.Scanner;

public class AgendaTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com o nome da agenda: ");
        String nome = input.next();
        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];

        for (int i = 0; i < 3; i++) {
            System.out.printf("\nEntre com a informação do contato %d: ", (i));
            Contato c = new Contato();

            System.out.println("Nome: ");
            nome = input.nextLine();
            c.setNome(nome);

            System.out.println("Telefone: ");
            String telefone = input.nextLine();
            c.setTelefone(telefone);

            System.out.println("Email: ");
            String email = input.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }

        agenda.setContato(contatos);

        if (agenda != null) {
            System.out.println(agenda.obterInfo());

        }
    }


}
