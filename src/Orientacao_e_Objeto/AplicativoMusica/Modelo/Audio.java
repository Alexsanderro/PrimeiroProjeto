package Orientacao_e_Objeto.AplicativoMusica;

import Orientacao_e_Objeto.AplicativoMusica.Modelo.Podcasts;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalDeReproducoes;
    private int curtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public void curtir(boolean curtida){
        System.out.println("Voce curtiu a musica!");
        int novaCurtida = getCurtidas() + 1;
        System.out.println("O total de curtidas agora e: "+ novaCurtida);
    }

    public void reproduzir(){
        System.out.println("Reproduzindo: " + getTitulo());
    }
}
