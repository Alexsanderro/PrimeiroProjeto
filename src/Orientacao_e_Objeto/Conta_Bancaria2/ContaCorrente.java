package Orientacao_e_Objeto;

public class ContaCorrente extends ContaBancaria2{
    private int tarifa;

    public void cobrarTarifaMensal(){
        tarifa = 100;
        saldo -= tarifa;
        System.out.println("Sua tarifa mensal e de " + tarifa + " e foi cobrada! Seu novo saldo e de " +saldo);
    }
}
