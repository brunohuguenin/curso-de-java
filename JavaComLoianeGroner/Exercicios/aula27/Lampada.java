package JavaComLoianeGroner.Exercicios.aula27;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garatiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    void ligar() {
        ligada = true;
        System.out.println("ligada");
    }

    void desligar() {
        ligada = false;
        System.out.println("desligada");
    }
}
