package src.javaViradoNoJiraya.AintroducaoClasses.test;

import src.javaViradoNoJiraya.AintroducaoClasses.dominio.Estudante;

public class PessoaTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Bruno";
        estudante.idade = 25;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
