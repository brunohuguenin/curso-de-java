package src.javaViradoNoJiraya;

// Tipos Primitivos
public class aula02 {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean

        int idadeDoPai = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        // String é uma class então, sempre com letra maúscula
        String nome = "Bruno Huguenin Messias";

        System.out.println("A idade é " + idadeDoPai + " anos");
        System.out.println(false);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
        System.out.println(nome );
    }
}
