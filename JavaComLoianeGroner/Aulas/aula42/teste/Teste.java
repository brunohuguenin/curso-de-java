package JavaComLoianeGroner.Aulas.aula42.teste;

import JavaComLoianeGroner.Aulas.aula42.dominio.Aluno;
import JavaComLoianeGroner.Aulas.aula42.dominio.Constantes;
import JavaComLoianeGroner.Aulas.aula42.dominio.Pessoa;
import JavaComLoianeGroner.Aulas.aula42.dominio.Professor;

public class Teste {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
       // Pessoa aluno = new Aluno();
       // Pessoa professor = new Professor();

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        // exemplo 02

        System.out.println(Constantes.URL_BLOG);
        //Constantes.URL_BLOG = "www.github.com/brunohuguenin";

        System.out.println(Constantes.URL_BLOG);
    }
}
