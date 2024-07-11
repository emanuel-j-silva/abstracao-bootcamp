package org.example;

public abstract class Conteudo {
    private String titulo;
    private String descricao;
    protected static double XP_PADRAO = 10;

    public Conteudo(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }
}
