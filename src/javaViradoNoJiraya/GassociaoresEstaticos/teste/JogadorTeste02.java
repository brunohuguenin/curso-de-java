package src.javaViradoNoJiraya.GassociaoresEstaticos.teste;

import src.javaViradoNoJiraya.GassociaoresEstaticos.domain.Jogador;
import src.javaViradoNoJiraya.GassociaoresEstaticos.domain.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Vinicius Junior");
        Time time = new Time("Real Madrid");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
