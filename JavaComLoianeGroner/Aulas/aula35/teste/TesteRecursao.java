package JavaComLoianeGroner.Aulas.aula35.teste;

import JavaComLoianeGroner.Aulas.aula35.dominio.Recursao;

public class TesteRecursao {
    public static void main(String[] args) {
        int fatorialNR = Recursao.fatorialNaoRecursivo(7);
        System.out.printf("\nFatrorial NAO RECURSIVO: %d", fatorialNR);

        int fatorialR = Recursao.fatorialRecursivo(7);
        System.out.printf("\nFatrorial  RECURSIVO: %d", fatorialR);
    }
}
