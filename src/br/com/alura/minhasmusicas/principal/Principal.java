package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;
import br.com.alura.minhasmusicas.modelos.minhasPreferidas;

public class Principal {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.setTitulo("In the End");
        musica1.setAlbum("Meteora");
        musica1.setGenero("Rock");
        musica1.setCantor("Linkin Park");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduzir();}

        for (int i = 0; i < 50; i++) {
            musica1.curtir();}

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Podpah");
        meuPodcast.setHost("Lucas Roque");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduzir();}

        for (int i = 0; i < 600; i++) {
          meuPodcast.curtir();}

        minhasPreferidas preferidas = new minhasPreferidas();

        preferidas.inclui(meuPodcast);
        preferidas.inclui(musica1);

    }
}
