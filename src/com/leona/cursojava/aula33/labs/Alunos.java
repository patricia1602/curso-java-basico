package com.leona.cursojava.aula33.labs;

public class Alunos {

    private String nome;
    private String matricula;
    private String nomeCurso;
    private String[] nomeDisciplinas;
    private double[][] notasDisciplinas;

    public Alunos() {
        nomeDisciplinas = new String[3];
        notasDisciplinas = new double[3][4];
    }

    public Alunos(String nome, String matricula, String nomeCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.nomeCurso = nomeCurso;
        this.nomeDisciplinas = new String[3];
        this.notasDisciplinas = new double[3][4];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String[] getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(String[] nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }

    public double[][] getNotasDisciplinas() {
        return notasDisciplinas;
    }

    public void setNotasDisciplinas(double[][] notasDisciplinas) {
        this.notasDisciplinas = notasDisciplinas;
    }

     public void mostrarInfo() {
        System.out.println("Nome:" + nome);
        System.out.println("Matricula:" + matricula);
        System.out.println("Nome do curso:" + nomeCurso);

        for (int i = 0; i < notasDisciplinas.length; i++) {
            System.out.println("Nota da Disciplina" + nomeDisciplinas[i]);
            for (int j = 0; j < notasDisciplinas[i].length; j++) {
                System.out.println(notasDisciplinas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean verificarAprovado(int indice) {

        double soma = 0;

        for (int i = 0; i < notasDisciplinas[indice].length; i++) {
            soma += notasDisciplinas[indice][i];
        }

        double media = soma / 4;

        if (media >= 7) {
            return true;
        } else {
            return false;
        }
    }
}
