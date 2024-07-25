package Orientacao_e_Objeto;

public class TestarProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("TV");
        produto.setPreco(1200);
        produto.adicionarDesconto(15);

        System.out.println("O produto " + produto.getNome() + " com o preco: " + produto.getPreco() + " com o desconto fica " + produto.getPreco());
    }
}
