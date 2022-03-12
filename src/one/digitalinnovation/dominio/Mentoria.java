package one.digitalinnovation.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

//----------------------------------------------CONSTRUTORES

    public Mentoria(){}

    public Mentoria(String titulo, String descricao, LocalDate data){
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.data = data;
    }

//----------------------------------------------GETTERS E SETTERS

    public LocalDate getData(){
        return data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }

//----------------------------------------------MÉTODOS SOBRESCRITOS

    @Override
    public String toString(){
        return "Mentoria{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

//-----------------------------------------------MÉTODO ABSTRATO

    @Override
    public double calcularXP(){
        return(XP_PADRAO + 20d);
    }

}
