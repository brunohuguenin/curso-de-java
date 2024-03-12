package JavaComLoianeGroner.Exercicios.aula34.dominio;

public class Contador {
    private static int cont;

    public static void incrementa() {
        cont += 1;
    }

    public static void zerar() {
        cont = 0;
    }

    public static int getCont() {
        return cont;
    }
}
