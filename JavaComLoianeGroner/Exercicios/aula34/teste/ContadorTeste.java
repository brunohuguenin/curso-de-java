package JavaComLoianeGroner.Exercicios.aula34.teste;

import JavaComLoianeGroner.Exercicios.aula34.dominio.Contador;


public class ContadorTeste {
    static void imprimirValor() {
        System.out.println(Contador.getCont());
    }

    public static void main(String[] args) {
      imprimirValor();

      Contador.incrementa();
      Contador.incrementa();
      Contador.incrementa();

      imprimirValor();

      Contador.zerar();
        Contador.incrementa();
        Contador.incrementa();
        Contador.incrementa();
        Contador.incrementa();
      imprimirValor();


    }
}
