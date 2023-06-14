package LinkedListExercises;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;

public class NotasExercise {
    public static void main(String[] args) {
        /*
        !Derivado do Exercicio notas de ArrayList!

        Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
*/
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");

        LinkedList<Double> notas = new LinkedList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Primeira nota da nova lista: " + notas.peekFirst() +  " or " + notas.peek() +  " or " + notas.get(0));
        System.out.println("Ultima nota da nova lista: " + notas.peekLast());
        System.out.println(notas.toString());

        System.out.println("Mostre a primeira nota da nova lista removendo-o: " + notas.removeFirst());
        System.out.println(notas.toString());
    }
}
