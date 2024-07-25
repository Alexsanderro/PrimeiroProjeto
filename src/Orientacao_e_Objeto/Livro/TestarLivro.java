package Orientacao_e_Objeto;

public class TestarLivro {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("A historia longa");
        livro.setAutor("Alexsander");
        livro.exibirDetalhes();
    }
}
