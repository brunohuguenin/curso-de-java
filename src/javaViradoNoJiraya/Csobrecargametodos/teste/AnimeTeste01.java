package src.javaViradoNoJiraya.Csobrecargametodos.teste;

import src.javaViradoNoJiraya.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Spike Lee", "Mangá", 12, "Ação");
        //anime.setGenero("Ação");

//        anime.setTipo("Mangá");
//        anime.setEpisodios(12);
//        anime.setNome("Spike Lee");
        anime.imprime();
    }
}
