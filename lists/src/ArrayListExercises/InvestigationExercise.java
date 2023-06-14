package ArrayListExercises;

import java.util.*;

//Give a verdict based on the qty of positive answers
public class InvestigationExercise {
    public static void main(String[] args) {
        List<String> questions = new ArrayList<>(Arrays.asList("1. Did you call the victim?", "2. Have you been to the crime scene?",
                "3. Do you live close to the victim?", "4. Did you owe anything to the victim?",
                "5. Have you ever worked with the victim"));
        int veredict = 0;
        Scanner input = new Scanner(System.in);

        for(String question: questions) {
            System.out.println(question);
            if(input.next().equals("yes"))
                veredict++;
        }


        switch (veredict) {
            case 1, 2 -> System.out.println("Suspect");
            case 3, 4 -> System.out.println("Accomplice");
            case 5 -> System.out.println("Murderer");
            default -> System.out.println("Innocent");
        }
    }

}
