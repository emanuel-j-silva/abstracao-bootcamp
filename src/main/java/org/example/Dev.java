package org.example;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        bootcamp.setDev(this);
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
    }
    public void progredir(){
        Optional<Conteudo> conteudo = conteudosInscritos.stream().findFirst();
        if (conteudo.isEmpty()) System.err.println("Não há conteúdo a ser visto!");
        else{
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }
    }
    public double calcularTotalXp(){
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }
    public void exibirCursos(){
        System.out.println("CURSOS PENDENTES");
        Iterator<Conteudo> inscritosIterator = conteudosInscritos.iterator();
        while (inscritosIterator.hasNext()){
            System.out.println(inscritosIterator.next());
        }

        System.out.println("CURSOS CONCLUÍDOS");
        Iterator<Conteudo> concluidosIterator = conteudosConcluidos.iterator();
        while (concluidosIterator.hasNext()){
            System.out.println(concluidosIterator.next());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
