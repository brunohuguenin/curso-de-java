package src.javaViradoNoJiraya.BintroducaoMetodos.teste;

import src.javaViradoNoJiraya.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Bruno Huguenin";
        funcionario.idade = 25;
        funcionario.salarios = new double[] {1200, 2560, 3578};

        funcionario.imprimirDadosS();
    }
}
