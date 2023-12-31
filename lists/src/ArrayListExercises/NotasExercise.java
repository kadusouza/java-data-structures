package ArrayListExercises;

import java.util.ArrayList;
import java.util.Iterator;

public class NotasExercise {
    public static void main(String[] args) {
//        pt-br
//        Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:
//        System.out.println("Crie uma lista e adicione as sete notas: ");
        ArrayList<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8.0);
        System.out.println(notas.toString());

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
//        Fiz assim:
        int posNota5 = notas.indexOf(5.0);
        notas.remove(posNota5);
        notas.add(posNota5, 6.0);
        System.out.println(notas.toString());
//        Deveria ser assim:
//        notas.set(notas.indexOf(5d), 6.0);



        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (double nota: notas) System.out.println(nota);

        double menorNota = notas.get(0);
        double maiorNota = notas.get(0);
        double soma = 0.0;
        for(double nota: notas) {
            if(nota < menorNota)
                menorNota = nota;
            if(nota > maiorNota)
                maiorNota = nota;
            soma += nota;
        }

        System.out.println("Exiba a menor nota: " + menorNota); // Mais facil -> Collections.min(notas)
        System.out.println("Exiba a maior nota: " + maiorNota); // Mais facil -> Collections.max(notas)
        System.out.println("Exiba a soma dos valores: " + soma);
//      Soma de outro jeito:
//      Iterator<Double> iterator = notas.iterator();
//      Double soma = 0d;
//        while(iterator.hasNext()){
//            Double next = iterator.next();
//            soma += next;
//        }
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas.toString());
        System.out.println("Remova a nota da posição 0: ");
        notas.remove(0);
        System.out.println(notas.toString());

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();

        System.out.println("Confira se a lista está vazia: "  + notas.isEmpty());



    }

}
