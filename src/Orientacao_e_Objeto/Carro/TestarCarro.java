package Orientacao_e_Objeto;

public class TestarCarro {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.modelo = "Fiat Uno";
        carro.cor = "Preto";
        carro.ano = 2007;

        carro.fichaTecnica();

        int idade = carro.calculoIdade();
        System.out.println("A idade do carro e: "+idade);
    }
}
