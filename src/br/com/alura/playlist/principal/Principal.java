package br.com.alura.playlist.principal;

import br.com.alura.playlist.modelos.Favoritas;
import br.com.alura.playlist.modelos.Musica;
import br.com.alura.playlist.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Livin' On a Prayer");
        minhaMusica.setCantor("Bon Jovi");


        //Simulando as curtidas e as musicas pra testar os métodos
        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        System.out.println(minhaMusica.getTotalReproducoes());
        System.out.println(minhaMusica.getTotalCurtidas());

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Bolha Dev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }
        System.out.println(meuPodcast.getTotalReproducoes());
        System.out.println(meuPodcast.getTotalCurtidas());

        //Instanciando as Musicas Favoritas
        Favoritas favoritas = new Favoritas();
        favoritas.inclui(minhaMusica);
        favoritas.inclui(meuPodcast);

    }


}
