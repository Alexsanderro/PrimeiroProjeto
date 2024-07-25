package Orientacao_e_Objeto;

public class TestarCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);
    }
}
