package JavaComLoianeGroner.Exercicios.aula27;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seus dados abaxo");
        System.out.print("Nome: ");
        String nome = scan.next();

        System.out.print("Número da mátricula: ");
        String matricula = scan.next();

        System.out.print("Nome do curso: ");
        String curso = scan.next();

        aluno.dadosAluno(nome, matricula, curso);

        System.out.println();
        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.print("Digite o nome da disicplina: " + i + ": ");
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo notas das disicplinas " + aluno.nomeDisciplinas[i]);
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++){
                System.out.print("Entre com a nota " + (j+1) + ": ");
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostarDadosNotas(aluno.nomeDisciplinas);

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi aprovado");
            } else {
                System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " - foi reprovado");
            }
        }
    }

}
