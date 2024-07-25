package Orientacao_e_Objeto;

public class TestarMusica {
    public static void main(String[] args) {

        Musica musica = new Musica();
        musica.titulo = "VLife";
        musica.artista = "YunkVino";
        musica.anoLancamento = 2023;

        musica.fichaTecnica();

        musica.avaliar(5);
        musica.avaliar(10);
        musica.avaliar(7);

        double media = musica.calcularMedia();
        System.out.println("Media de avaliacao: "+media);
    }
}
