package Orientacao_e_Objeto;

public class Gato extends Animal{
    @Override
    protected void emitriSom() {
        System.out.println("Miau Miau Miau");
    }

    public void arranharMovel(){
        System.out.println("Arranhando movel");
    }
}
