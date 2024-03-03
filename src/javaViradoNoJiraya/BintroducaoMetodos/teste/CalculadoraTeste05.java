package src.javaViradoNoJiraya.BintroducaoMetodos.teste;

import src.javaViradoNoJiraya.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,4,5,6};
        calculadora.somaArray(numeros);

        calculadora.somaVarArgs(1,2,3,4,5,6,7,8,9);
    }
}
