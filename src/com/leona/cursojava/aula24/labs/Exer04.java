package com.leona.cursojava.aula24.labs;

import java.util.Date;

public class Exer04 {

    public static void main(String[] args) {

        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loaine Groner";
        livro.anoLançamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Loiane";

        System.out.println("Nome do livro = " + livro.nome);

    }
}
