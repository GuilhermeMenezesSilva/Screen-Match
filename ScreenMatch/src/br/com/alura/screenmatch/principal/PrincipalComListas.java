package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Transformes", 2023);
        outroFilme.avalia(6);

        var filmeDeAlguem = new Filme("Dogville", 2003);
        filmeDeAlguem.avalia(10);

        Serie minhaSerie = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDeAlguem);
        lista.add(minhaSerie);
        for(Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Matheus");
        buscaPorArtista.add("Guilherme");
        buscaPorArtista.add("Vinicius");
        buscaPorArtista.add("Spyke");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Pós ordenação: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Ordenação de filmes: " + lista);
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));


    }
}
