package Orientacao_e_Objeto;

public class TestarAluno2 {
    public static void main(String[] args) {
        Aluno2 aluno = new Aluno2();
        aluno.setNome("Alexsander");
        aluno.setNota1(25);
        aluno.setNota2(13);
        aluno.setNota3(30);

        System.out.println("Aluno: " +aluno.getNome());
        System.out.println("Com as notas: " + aluno.getNota1() + ", " + aluno.getNota2() + ", " + aluno.getNota3());
        System.out.println("Media: " + aluno.calcularMedia());
    }
}
