package Orientacao_e_Objeto;

public class ContaBancaria2 {
    private String nome;
    private String TipodeConta;
    protected int saldo = 3000;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipodeConta(String tipodeConta) {
        TipodeConta = tipodeConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void fichaTecnica(){
        System.out.println("-------CONTA-------");
        System.out.println("Nome: " +nome);
        System.out.println("Tipo de conta: "+TipodeConta);
        System.out.println("Saldo: "+saldo);
    }

    public void depositar(int deposita){
        deposita += saldo;
        saldo = deposita;
    }

    public void sacar(int saca){
        saldo -= saca;
    }

}
