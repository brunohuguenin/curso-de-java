package src.javaViradoNoJiraya.BintroducaoMetodos.teste;

import src.javaViradoNoJiraya.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Bruno Huguenin");
        funcionario.setIdade(25);
        funcionario.setSalarios( new double[] {1200, 2560, 3578});

        funcionario.imprimirDadosS();
    }
}
 