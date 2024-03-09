package src.javaViradoNoJiraya.GassociaoresEstaticos.teste;

import src.javaViradoNoJiraya.GassociaoresEstaticos.domain.Jogador;
import src.javaViradoNoJiraya.GassociaoresEstaticos.domain.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Gabigol");
        Time time = new Time("Flamengo");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("---- Jogador ----");
        jogador.imprime();
        System.out.println("---- Time ----");
        time.imprime();

    }
}
