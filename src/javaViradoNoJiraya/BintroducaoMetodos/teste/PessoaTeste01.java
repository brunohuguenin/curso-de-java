package src.javaViradoNoJiraya.BintroducaoMetodos.teste;

import src.javaViradoNoJiraya.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jiraya");
        //pessoa.setIdade(-32);

//        pessoa.imprime();

        String pegueiNome = pessoa.getNome();
        System.out.println(pegueiNome);
    }
}
