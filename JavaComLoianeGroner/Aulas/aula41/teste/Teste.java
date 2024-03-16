package JavaComLoianeGroner.Aulas.aula41.teste;

import JavaComLoianeGroner.Aulas.aula41.dominio.Aluno;
import JavaComLoianeGroner.Aulas.aula41.dominio.Pessoa;
import JavaComLoianeGroner.Aulas.aula41.dominio.Professor;

public class Teste {
    public static void main(String[] args) {
       // Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

       // pessoa.setEndereco("Rua Logo Ali, nº 95");
        aluno.setEndereco("Rua Quase Lá, nº 886");
        professor.setEndereco("Rua Tá Perto, nº 13");


    }
}
