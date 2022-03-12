package one.digitalinnovation.dominio;

public class Curso extends Conteudo{

    private int cargaHoraria;

//----------------------------------------------CONSTRUTORES

    public Curso(){}

    public Curso(String titulo, String descricao, int cargaHoraria){
        super.setTitulo(titulo);
        super.setDescricao(descricao);
        this.cargaHoraria = cargaHoraria;
    }

//----------------------------------------------GETTERS E SETTERS

    public int getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

//----------------------------------------------MÉTODOS SOBRESCRITOS

    @Override
    public String toString(){
        return "Curso{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

//------------------------------------------------MÉTODO ABSTRATO

    @Override
    public double calcularXP(){
        return(XP_PADRAO * cargaHoraria);
    }

}
