package src.javaViradoNoJiraya.Dconstrutores.teste;

import src.javaViradoNoJiraya.Dconstrutores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Spike Lee", "Mangá", 12, "Adventure", "Universal");
        //anime.setGenero("Ação");

//        anime.setTipo("Mangá");
//        anime.setEpisodios(12);
//        anime.setNome("Spike Lee");
        anime.imprime();
    }
}
