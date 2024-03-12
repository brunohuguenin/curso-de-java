package JavaComLoianeGroner.Aulas.aula34.teste;

import JavaComLoianeGroner.Aulas.aula34.dominio.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
//        Calculadora calc = new Calculadora();
//
//        int soma = calc.soma(1, 2);
//        System.out.println(soma);
//        double soma2 = calc.soma(7.5, 6.3);
//        System.out.println(soma2);

        int soma = Calculadora.soma(254, 3682);
        double soma2 = Calculadora.soma(142.689, 75.9893);

        System.out.println(soma);
        System.out.printf("%.2f", soma2);
    }
}
