package Orientacao_e_Objeto;

public class Cachorro extends Animal{
    @Override
    protected void emitriSom() {
        System.out.println("Au au au");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo do cachorro");
    }
}
