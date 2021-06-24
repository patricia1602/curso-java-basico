package com.leona.cursojava.aula24.labs;

public class Exer03 {

    public static void main(String[] args) {

        LivroLivraria livro = new LivroLivraria();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loaine Groner";
        livro.anoLançamento = 2015;
        livro.preco = 63.39;

        System.out.println("Nome do livro = " + livro.nome);

    }
}
