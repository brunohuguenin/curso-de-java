package JavaComLoianeGroner.Exercicios.aula36.ex2.teste;

import JavaComLoianeGroner.Exercicios.aula36.ex2.dominio.Aluno;
import JavaComLoianeGroner.Exercicios.aula36.ex2.dominio.Curso;
import JavaComLoianeGroner.Exercicios.aula36.ex2.dominio.Professor;

import java.util.Scanner;

public class CursoTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o nome do curso");
        String nome = input.nextLine();

        System.out.println("Entre com o horário do curso");
        String horario = input.nextLine();

        System.out.println("Entre com o nome do professor");
        String nomeProf = input.nextLine();

        System.out.println("Entre com o departamento do professor");
        String dep = input.nextLine();

        System.out.println("Entre com o email do professor");
        String emailProf = input.nextLine();

        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);

        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(dep);
        professor.setEmail(emailProf);

        curso.setProfessor(professor);

        System.out.println("====== ALUNOS =====");

        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < 5; i++) {

            input.nextLine();

            System.out.println("Entre com o nome do Aluno");
            String nomeAluno = input.nextLine();

            System.out.println("Entre com a matricula do Aluno");
            String matAluno = input.nextLine();

            double[] notas = new double[4];
            for (int j = 0; j < 4; j ++) {
                System.out.println("Entre com a nota " + (j+1));
                notas[j] = input.nextDouble();
            }

            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);

            alunos[i] = aluno;

        }
        curso.setAlunos(alunos);

        System.out.println(curso.obterInfo());

    }
}
