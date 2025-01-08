public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    void ExibeFichaTecnica(){
        System.out.println("O nome do filme é " + nome + " e sua duração é de " + duracaoEmMinutos + " minutos");
    }

    void Avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;

    }
}
