package src.javaViradoNoJiraya.GassociaoresEstaticos.teste;

import src.javaViradoNoJiraya.GassociaoresEstaticos.domain.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Cristiano Ronaldo");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Neymar");

        Jogador[] jogadores = new Jogador[] {jogador1, jogador2, jogador3};

        for (Jogador jogador: jogadores) {
            jogador.imprime();
        }

    }
}
