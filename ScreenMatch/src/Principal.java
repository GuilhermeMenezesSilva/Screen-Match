import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Poderoso Chefão");
//        meuFilme.setNome("Poderoso chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Filme outroFilme = new Filme("Transformes");
//        outroFilme.setNome("Transformes");
        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        Serie minhaSerie = new Serie();
        minhaSerie.setNome("LOST");
        minhaSerie.setAnoLancamento(2000);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodioPorTemporada(10);
        minhaSerie.setMinutosPorEpisodios(50);
        System.out.println("Duração da série: " + minhaSerie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setSerie("lost");
        ep.setTotalVisualizacoes(300);
        filtro.filtra(ep);

        var filmeDeAlguem = new Filme();
        filmeDeAlguem.setDuracaoEmMinutos(200);
        filmeDeAlguem.setNome("Dogville");
        filmeDeAlguem.setAnoLancamento(2003);
        filmeDeAlguem.avalia(10);

        ArrayList<Filme> listaDeFilme = new ArrayList<>();
        listaDeFilme.add(meuFilme);
        listaDeFilme.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilme.size());
        System.out.println("Filmes: " + listaDeFilme.get(0).getNome());
        System.out.println(listaDeFilme);
        System.out.println("toString do filme: " + listaDeFilme.get(0).toString());
    }
}