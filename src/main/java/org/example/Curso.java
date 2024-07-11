package org.example;

public class Curso extends Conteudo{
    private int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super(titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso -> " +
                "Carga horária: " + cargaHoraria + " | " +
                "Título: " + getTitulo() + " | " +
                "Descrição: " + getDescricao();
    }
}
