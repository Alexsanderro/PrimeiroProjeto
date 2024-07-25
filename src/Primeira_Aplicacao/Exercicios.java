public class Exercicios {

    public static void main(String[] args) {
        int nota1 = 5;
        int nota2 = 7;
        int media = (nota1 + nota2) /2;
        System.out.println("A media da nota e: " + media);

        double num1 = 6.3;
        int conversao = (int) (num1);
        System.out.println(conversao);

        char letra = 'a';
        String palavra = "Alexsander";
        System.out.println("A letra " + letra + " A palavra " + palavra);

        double precoProduto = 4.3;
        int quantidade = 8;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Preco do produto = " + valorTotal);

        double valorEmDolares = 83.3;
        double valorDolar = 4.94;
        double conversaoReais = valorEmDolares * valorDolar;
        System.out.println("O valor em reais e: " + conversaoReais);

        double precoOriginal = 15.0;
        double percentualDesconto = 15.0;
        double aplicarDesconto = (percentualDesconto/100) * precoOriginal;
        double novoPreco = precoOriginal - aplicarDesconto;
        System.out.println("Preco com o desconto aplicatdo: " + novoPreco);
    }
}
