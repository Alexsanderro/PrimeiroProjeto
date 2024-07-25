package Listas_e_Colecoes_dados.Principal;

import Listas_e_Colecoes_dados.Pessoa.Pessoa;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Alexsander", 20);
        Pessoa pessoa2 = new Pessoa("Joice", 22);
        Pessoa pessoa3 = new Pessoa("Alessandra", 25);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println();
    }
}
