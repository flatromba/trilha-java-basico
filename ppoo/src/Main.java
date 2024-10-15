import java.time.LocalDate;

import desafioDio.dominio.Bootcamp;
import desafioDio.dominio.Curso;
import desafioDio.dominio.Dev;
import desafioDio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso javascript");
        curso2.setDescricao("descricao curso javascript");
        curso2.setCargaHoraria(2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        System.out.println(bootcamp.getDataInicial());
        System.out.println(bootcamp.getDataFinal());

        Dev dev1 = new Dev();
        dev1.setNome("Flavio");
        dev1.InscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos do dev "+dev1.getNome()+" : "+dev1.getConteudosInscritos());
        bootcamp.getDataInicial();
        dev1.progredir();
        dev1.progredir();
        System.out.println();
        System.out.println("Conteudos inscritos do dev "+dev1.getNome()+" : "+dev1.getConteudosInscritos());
        System.out.println("Conteudos concluidos do dev "+dev1.getNome()+" : "+dev1.getConteudosConcluidos());
        System.out.println("XP ganha  do dev "+dev1.getNome()+" : "+dev1.calcularXpTotal());

        Dev dev2 = new Dev();
        dev2.setNome("Sara");
        dev2.InscreverBootcamp(bootcamp);  
        System.out.println("Conteudos inscritos do dev "+dev2.getNome()+" : "+dev2.getConteudosInscritos());
        dev2.progredir(); 
        System.out.println();  
        System.out.println("Conteudos inscritos do dev "+dev2.getNome()+" : "+dev2.getConteudosInscritos());   
        System.out.println("Conteudos concluidos do dev "+dev2.getNome()+" : "+dev2.getConteudosConcluidos());
        System.out.println("XP ganha  do dev "+dev2.getNome()+" : "+dev2.calcularXpTotal());
    }
}
