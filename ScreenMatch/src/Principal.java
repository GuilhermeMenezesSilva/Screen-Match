public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "Poderoso chefão";
        meuFilme.anoLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.ExibeFichaTecnica();
        meuFilme.Avalia(8);
        meuFilme.Avalia(5);
        meuFilme.Avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}