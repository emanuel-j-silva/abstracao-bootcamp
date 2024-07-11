package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super(titulo, descricao);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria -> " +
                "Data: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " | " +
                "Título: " + getTitulo() + " | " +
                "Descrição: " + getDescricao();
    }
}
