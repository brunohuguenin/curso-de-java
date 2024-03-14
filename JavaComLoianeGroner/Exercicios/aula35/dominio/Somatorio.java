package JavaComLoianeGroner.Exercicios.aula35.dominio;

public class Somatorio {
    public static int somarAte(int num) {
//        int aux = 0;
//        for (int i = 0; i <= num; i++){
//            aux += i;
//        }
//        return aux;
        if (num == 1) {
            return 1;
        }
        return num + somarAte(num - 1);
    }
}
