package RainbowExercise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//      Create a set containing the colors of the rainbow and:
        HashSet<String> rainbowColors = new HashSet<>(Arrays.asList("Red", "Orange", "Yellow", "Green",
                "Blue", "Indigo", "Violet"));
//      Display all the colors one below the other.
        for (String rainbowColor: rainbowColors) {
            System.out.println(rainbowColor);
        }
//      The number of colors in the rainbow.
        System.out.println("A rainbow has " + rainbowColors.size() + " colors.");
//      Display the colors in alphabetical order.
        TreeSet<String> sortedAlphabeticalColors = new TreeSet<>(rainbowColors);
        System.out.println(sortedAlphabeticalColors);
//      Display the colors in the reverse order of the one provided.
//      I Should've used Collections.reverse, keep it simple.
        LinkedHashSet<String> auxRainbowColors = new LinkedHashSet<>(rainbowColors);
        List<String> invertedColorsArray = new ArrayList<>(auxRainbowColors);
        for (int i = invertedColorsArray.size() - 1; i > 0 ; i--) {
            System.out.println(invertedColorsArray.get(i));
        }
//      Display all the colors that start with the letter "v".
        for (String vInitColor: rainbowColors) {
            if(vInitColor.startsWith("V"))
                System.out.println(vInitColor);
        }
//      Remove all the colors that do not start with the letter "v".
        Iterator<String> iterator = rainbowColors.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if(!next.startsWith("V"))
                iterator.remove();
        }
        System.out.println(rainbowColors);
//      Clear the set.
        rainbowColors.clear();
//      Check if the set is empty.
        System.out.println("The set is empty? " + rainbowColors.isEmpty());
    }
}
