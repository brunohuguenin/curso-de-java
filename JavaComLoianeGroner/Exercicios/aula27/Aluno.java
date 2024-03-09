package JavaComLoianeGroner.Exercicios.aula27;

public class Aluno {
    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplinas = new String[3];
    double[][] notasDisciplinas = new double[3][4];

    void dadosAluno (String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = curso;
        System.out.print("Aluno " + nome + ", matrícula " + matricula + " do curso de " + curso + " cadastrado com sucesso!");

    }

    void mostarDadosNotas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
        for (int i = 0; i < notasDisciplinas.length; i ++) {
            System.out.println("Notas da disciplina de " + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    boolean verificarAprovado(int indice) {

        double soma = 0;

        for (int i = 0; i <notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        if (media >= 7) {
            return true;
        }
        return false;
    }

}
