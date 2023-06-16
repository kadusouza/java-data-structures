import Model.ActivitiesAndCourses;
import Model.Content;
import Model.Dev;
import Model.Mentorship;
import Service.Bootcamp;
import Service.DevService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        DevService devService = new DevService();

        ActivitiesAndCourses curso1 = new ActivitiesAndCourses();
        curso1.setTitle("curso java");
        curso1.setDescription("descrição curso java");
        curso1.setDuration(8);

        ActivitiesAndCourses curso2 = new ActivitiesAndCourses();
        curso2.setTitle("curso js");
        curso2.setDescription("descrição curso js");
        curso2.setDuration(4);

        Mentorship mentoria = new Mentorship();
        mentoria.setTitle("mentoria de java");
        mentoria.setDescription("descrição mentoria java");
        mentoria.setMentorshipDate(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(curso1);
        bootcamp.getContents().add(curso2);
        bootcamp.getContents().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setName("Camila");

        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getSubscribedCourses());
        devService.progress(devCamila);
        devService.progress(devCamila);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getSubscribedCourses());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getSubscribedCourses());
        System.out.println("XP:" + devService.calculateTotalXp(devCamila));

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setName("Joao");
        devService.singUpToBootCamp(bootcamp, devJoao);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getSubscribedCourses());
        devService.progress(devJoao);
        devService.progress(devJoao);
        devService.progress(devJoao);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getSubscribedCourses());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConcludedCourses());
        System.out.println("XP:" + devService.calculateTotalXp(devJoao));

    }
}
