package src.javaViradoNoJiraya.AintroducaoClasses.test;

import src.javaViradoNoJiraya.AintroducaoClasses.dominio.Estudante;

public class PessoaTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();


        estudante.idade = 50;
        estudante.nome = "Clauber Cruz";




        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);

        System.out.println("---------------------");

        System.out.println(estudante2.idade);
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
    }
}
