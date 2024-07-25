package Orientacao_e_Objeto;

public class Carro {

    String modelo;
    int ano;
    String cor;

    void fichaTecnica(){
        System.out.println("Modelo do carro: "+modelo);
        System.out.println("Ano do carro: " +ano);
        System.out.println("Cor do carro: "+cor);
    }

    int calculoIdade(){
        return 2024 - ano;
    }
}
