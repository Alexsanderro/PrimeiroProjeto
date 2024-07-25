package Orientacao_e_Objeto;

public class TestandoAnimal {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.emitriSom();
        gato.arranharMovel();

        Cachorro cachorro = new Cachorro();
        cachorro.emitriSom();
        cachorro.abanarRabo();
    }
}
