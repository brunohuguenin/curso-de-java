package src.javaViradoNoJiraya.EblocosInicializacao.teste;

import src.javaViradoNoJiraya.EblocosInicializacao.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.println(anime.getEpisodios());

        for (int episodio: anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }
    }
}
