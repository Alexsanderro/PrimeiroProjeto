package Orientacao_e_Objeto;

public class TestarIdadePessoa {
    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setNome("Alexsander");
        pessoa.setIdade(20);

        pessoa.verificarIdade();
    }
}
