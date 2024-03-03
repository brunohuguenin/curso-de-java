package src.javaViradoNoJiraya.BintroducaoMetodos.teste;

import src.javaViradoNoJiraya.BintroducaoMetodos.dominio.Estudante;
import src.javaViradoNoJiraya.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Seya";
        estudante1.idade = 13;
        estudante1.sexo = 'M';

        estudante2.nome = "Ada";
        estudante2.idade = 26;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
