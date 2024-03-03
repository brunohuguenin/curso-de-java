package src.javaViradoNoJiraya.BintroducaoMetodos.teste;

import src.javaViradoNoJiraya.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTeste01");

        System.out.println("=========================================");

        Calculadora calculadora2 = new Calculadora();
        calculadora2.subtrairDoisNumeros();
        System.out.println("Finalizando CalculadoraTeste02");


    }
}
