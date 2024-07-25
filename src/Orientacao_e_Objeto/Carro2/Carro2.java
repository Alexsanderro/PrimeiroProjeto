package Orientacao_e_Objeto;

public class Carro2 {
    protected String modelo;
    protected int precoano1;
    protected int precoano2;
    protected int precoano3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecoano1() {
        return precoano1;
    }

    public void setPrecoano1(int precoano1) {
        this.precoano1 = precoano1;
    }

    public int getPrecoano2() {
        return precoano2;
    }

    public void setPrecoano2(int precoano2) {
        this.precoano2 = precoano2;
    }

    public int getPrecoano3() {
        return precoano3;
    }

    public void setPrecoano3(int precoano3) {
        this.precoano3 = precoano3;
    }

    public void fichaTecnica(){
        System.out.println("Modelo: " +getModelo());
        System.out.println("Preco do primeiro ano: " + getPrecoano1());
        System.out.println("Preco do segundo ano: " + getPrecoano2());
        System.out.println("Preco do terceiro ano: " + getPrecoano3());
        System.out.println("Preco total: " + totalPreco());
        System.out.println("Maior preco dos anos foi: "+maior());
        System.out.println("Menor preco dos anos foi: "+menor());
    }

    private int totalPreco(){
        return precoano1 + precoano2 + precoano3;
    }

    private int maior(){
        int maiorPreco = precoano1;
        if (precoano2 > precoano1 && precoano2 > precoano3){
            maiorPreco = precoano2;
        } else if (precoano3 > precoano2 && precoano3 > precoano1) {
            maiorPreco = precoano3;
        }
        return maiorPreco;
    }

    private int menor(){
        int menorPreco = precoano1;
        if (precoano2 < precoano1 && precoano2 < precoano3) {
            menorPreco = precoano2;
        } else if (precoano3 < precoano2 && precoano3 < precoano1) {
            menorPreco = precoano3;
        }
        return menorPreco;
    }


}
