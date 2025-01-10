import br.com.alura.screenmatch.modelo.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Poderoso chefão");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.ExibeFichaTecnica();
        meuFilme.Avalia(8);
        meuFilme.Avalia(5);
        meuFilme.Avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}