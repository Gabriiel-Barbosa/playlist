package br.com.alura.playlist.modelos;

public class Favoritas {

    public void inclui(Audio audio){
        if(audio.getClassificacao() >=9){
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos");
        }
        else {
            System.out.println(audio.getTitulo() + " é uma boa opção para curtir de vez em quando");
        }
    }
}
