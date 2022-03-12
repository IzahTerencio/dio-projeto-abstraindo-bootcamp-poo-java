package one.digitalinnovation.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev{

    private String nome;
    private Set<Conteudo> contInscritos = new LinkedHashSet<>();
    private Set<Conteudo> contConcluidos = new LinkedHashSet<>();

//------------------------------------------------GETTERS E SETTERS

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Set<Conteudo> getContInscritos(){
        return contInscritos;
    }

    public void setContInscritos(Set<Conteudo> contInscritos){
        this.contInscritos = contInscritos;
    }

    public Set<Conteudo> getContConcluidos(){
        return contConcluidos;
    }

    public void setContConcluidos(Set<Conteudo> contConcluidos){
        this.contConcluidos = contConcluidos;
    }

//------------------------------------------------MÉTODOS ESPECÍFICOS

    public void inscrever(Bootcamp bootcamp){

        this.contInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);

    }

    public void progredir(){

        Optional<Conteudo> cont = this.contInscritos
                .stream().findFirst();

        if(cont.isPresent()){
            this.contConcluidos.add(cont.get());
            this.contInscritos.remove(cont.get());
        } else{
            System.err.println("Vocẽ não está matriculado em nenhum conteúdo ainda :(");
        }

    }

    public double calcularXP(){

        return( this.contConcluidos.stream()
                .mapToDouble(conteudo -> conteudo.calcularXP())
                .sum() );

    }

//------------------------------------------------MÉTODOS SOBRESCRITOS

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(contInscritos, dev.contInscritos) && Objects.equals(contConcluidos, dev.contConcluidos);
    }

    @Override
    public int hashCode(){
        return Objects.hash(nome, contInscritos, contConcluidos);
    }

}
