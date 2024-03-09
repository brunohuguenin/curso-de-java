package src.javaViradoNoJiraya.GassociaoresEstaticos.teste;

import src.javaViradoNoJiraya.GassociaoresEstaticos.domain.Escola;
import src.javaViradoNoJiraya.GassociaoresEstaticos.domain.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi sensei");
        Professor professor2 = new Professor("Asuma Sensei");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();

    }
}
