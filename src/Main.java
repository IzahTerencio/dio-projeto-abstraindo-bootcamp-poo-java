import one.digitalinnovation.dominio.Curso;
import one.digitalinnovation.dominio.Mentoria;

import java.time.LocalDate;

public class Main{

    public static void main(String[] args){

        Curso c = new Curso();
        c.setTitulo("Curso Java");
        c.setDescricao("Descrição Curso Java");
        c.setCargaHoraria(10);
        System.out.println(c);

        Mentoria m = new Mentoria();
        m.setTitulo("Mentoria Java");
        m.setDescricao("Descrição Mentoria Java");
        m.setData(LocalDate.now());
        System.out.println(m);

    }

}
