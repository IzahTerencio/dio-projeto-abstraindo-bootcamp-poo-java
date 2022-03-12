import one.digitalinnovation.dominio.*;

import java.time.LocalDate;

public class Main{

    public static void main(String[] args){

        Conteudo c1 = new Curso("Pensamento computacional",
                "----------------", 2);
        Conteudo c2 = new Curso("Estruturas de dados em Java: Introdução",
                "----------------", 2);
        Conteudo m1 = new Mentoria("Como se tornar um desenvolvedor de sucesso na Sportheca",
                "----------------", LocalDate.now());

        Bootcamp bc = new Bootcamp();
        bc.setNome("Bootcamp Sportheca Developer");
        bc.setDescricao("Trilha completa sobre Java, Kotlin e Android para se tornar um dev mobile de ponta e tenha a chance de trabalhar na gigante Sportheca.");
        bc.getConteudos().add(c1);
        bc.getConteudos().add(c2);
        bc.getConteudos().add(m1);

        Dev d1 = new Dev();
        d1.setNome("Izabella Assis");
        d1.inscrever(bc);
        Dev d2 = new Dev();
        d2.setNome("João da Cunha");
        d2.inscrever(bc);

        System.out.println("Conteúdos inscritos: " + d1.getContInscritos());
        System.out.println("Conteúdos inscritos: " + d2.getContInscritos());

        d1.progredir();
        d2.progredir();

        System.out.println("Conteúdos concluídos: " + d1.getContConcluidos());
        System.out.println("Conteúdos concluídos: " + d2.getContConcluidos());

    }

}
