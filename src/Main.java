import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args){


        Conteudo cursoJava = new Curso();
        cursoJava.setTitulo("JAVA ");
        cursoJava.setDescricao("Curso de JAVA ");
        ((Curso) cursoJava).setCargaHoraria(8);

        Conteudo cursoJavaScript = new Curso();
        cursoJavaScript.setTitulo("JAVA SCRIPT");
        cursoJavaScript.setDescricao("Curso de JAVA SCRIPT");
        ((Curso) cursoJavaScript).setCargaHoraria(8);

        Conteudo mentoria = new Mentoria();
        mentoria.setDescricao("Mentoria Java");
        mentoria.setTitulo("Java Mentoria");
        ((Mentoria) mentoria).setData(LocalDate.now());

//        System.out.println(cursoJava);
//        System.out.println(cursoJavaScript);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp de Java");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJavaScript);
        bootcamp.getConteudos().add(mentoria);

        Dev devHugo = new Dev();
        devHugo.setNome("Hugo");
        devHugo.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos do Dev Hugo" + devHugo.getConteudosInscritos());
        devHugo.progredir();
        System.out.println("_");
        System.out.println("Conteúdos inscritos do Dev Hugo" + devHugo.getConteudosInscritos());
        System.out.println("Conteúdos concluidos do Dev Hugo" + devHugo.getConteudosConcluidos());
        System.out.println("XP: " + devHugo.calcularTotalXp());


        System.out.println("********************");
        Dev devEmily = new Dev();
        devEmily.setNome("Emily");
        devEmily.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos da Dev Emily" + devEmily.getConteudosInscritos());

        devEmily.progredir();
        devEmily.progredir();
        devEmily.progredir();
        System.out.println("_");
        System.out.println("Conteúdos concluidos da Dev Emily" + devEmily.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos da Dev Emily" + devEmily.getConteudosInscritos());
        System.out.println("XP: " + devEmily.calcularTotalXp());




    }
}