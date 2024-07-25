package Orientacao_e_Objeto;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica() {
        System.out.println("Nome da musica: " +titulo + " Artista: " + artista + " Ano de Lancamento: " +anoLancamento);
    }

    void avaliar(double minhaAvaliacao){
        avaliacao += minhaAvaliacao;
        numAvaliacoes++;
    }

    double calcularMedia() {
        return avaliacao / numAvaliacoes;
    }
}
