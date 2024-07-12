package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Dev dev = new Dev("Carlos");
        Bootcamp bootcamp = new Bootcamp(LocalDate.now(),
                "Java", "Bootcamp Java com Spring Framework");

        Curso curso1 = new Curso("AP", "Algoritmos e Programação", 5);
        Curso curso2 = new Curso("POO", "Programação Orientada a Objetos", 15);
        Curso curso3 = new Curso("IS", "Introdução ao Spring Framwork",10);
        Mentoria mentoria1 = new Mentoria("M1", "Dúvidas relacionadas a POO", LocalDate.now());

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria1);

        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Carlos:");
        dev.exibirCursos();
        dev.progredir();
        dev.progredir();
        System.out.println("Conteúdos Carlos após progresso:");
        dev.exibirCursos();
        System.out.println("XP Carlos: " + dev.calcularTotalXp());
    }
}