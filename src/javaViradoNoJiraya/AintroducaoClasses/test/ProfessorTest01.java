package src.javaViradoNoJiraya.AintroducaoClasses.test;

import src.javaViradoNoJiraya.AintroducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Girafales";
        professor.idade = 52;
        professor.sexo = 'M';

        System.out.println(professor.nome);
        System.out.println(professor.idade);
        System.out.println(professor.sexo);

    }
}
