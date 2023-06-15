package DiceRollExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/*
This program simulates rolling a dice.
Roll the dice 100 times and store the results.
Then, display how many times each value was rolled.
*/
public class Main {
    public static void main(String[] args) {
        int numberOfRolls = 100;
        Map<Integer, Integer> rolls = new HashMap<>();
        rolls.put(1, 0);
        rolls.put(2, 0);
        rolls.put(3, 0);
        rolls.put(4, 0);
        rolls.put(5, 0);
        rolls.put(6, 0);

        for(int i = 0; i < numberOfRolls; i++) {
            int result = rollDice();
            int count = rolls.get(result);
            count++;
            rolls.put(result, count);
        }
        System.out.println(rolls);

        for (Map.Entry<Integer, Integer> entry: rolls.entrySet()){
            System.out.println("The number " + entry.getKey() + " was rolled " + entry.getValue() + " times." );
        }
    }

    public static int rollDice() {
        return ThreadLocalRandom.current().nextInt(1, 7);
    }
}
