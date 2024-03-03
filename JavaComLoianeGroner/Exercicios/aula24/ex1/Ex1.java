package JavaComLoianeGroner.Exercicios.aula24.ex1;

public class Ex1 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garantiasMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoDeLuz = "Amarela";

        lampada.tipos = new String[2];
        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
        lampada.tipos[2] = "Lanterna";
    }
}
