package StatesExercise;

import java.text.DecimalFormat;
import java.util.*;

/*
Given the estimated population of some states in northeastern Brazil, do the following:
State = PE - Population = 9,616,621
State = AL - Population = 3,351,543
State = CE - Population = 9,187,103
State = RN - Population = 3,534,265
*/
public class Main {
    public static void main(String[] args) {
//        Create a dictionary and relate the states to their populations;
        Map<String, Long> statesPopulations = new HashMap<>();
        statesPopulations.put("PE", 9616621L);
        statesPopulations.put("AL", 3351543L);
        statesPopulations.put("CE", 9187103L);
        statesPopulations.put("RN", 3534265L);

//        Replace the population of the RN state with 3,534,165;
        statesPopulations.put("RN", 3534165L);

//        Check if the state PB is in the dictionary, if not, add it: PB - 4,039,277;
        if(!statesPopulations.containsKey("PB"))
            statesPopulations.put("PB", 4039277L);

//        Display the population of PE.
        DecimalFormat formatter = new DecimalFormat("#,###");
        System.out.println("The population of PE is: " + formatter.format(statesPopulations.get("PE")));

//        Display all states and their populations in the order they were provided;
        Map<String, Long> insertionStatesPopulations = new LinkedHashMap<>();
        insertionStatesPopulations.put("PE", 9616621L);
        insertionStatesPopulations.put("AL", 3351543L);
        insertionStatesPopulations.put("CE", 9187103L);
        insertionStatesPopulations.put("RN", 3534165L);
        insertionStatesPopulations.put("PB", 4039277L);

//        Display the states and their populations in alphabetical order;
        Map<String, Long> orderedPopulations = new TreeMap<>(insertionStatesPopulations);

//        Display the state with the smallest population and its quantity;
        long smallestPopulationValue = Collections.min(orderedPopulations.values());
        String smallestPopulationState = "";
        Set<Map.Entry<String, Long>> entries = orderedPopulations.entrySet();
        for (Map.Entry<String, Long> entry: entries) {
            if(entry.getValue().equals(smallestPopulationValue))
                smallestPopulationState = entry.getKey();
        }
        System.out.println("The smallest populations state is " + smallestPopulationState +
                " with: " + formatter.format(smallestPopulationValue) + " persons.");

//        Display the state with the largest population and its quantity;
        long largestPopulationValue = Collections.max(orderedPopulations.values());
        String largestPopulationState = "";
        Set<Map.Entry<String, Long>> entries2 = orderedPopulations.entrySet();
        for(Map.Entry<String, Long> entry: entries2) {
            if(entry.getValue().equals(largestPopulationValue))
                largestPopulationState = entry.getKey();
        }
        System.out.println("The largest populations state is " + largestPopulationState +
                " with: " + formatter.format(largestPopulationValue) + " persons.");

//        Display the sum of the population of these states;
        long soma = 0L;
        Set<Map.Entry<String, Long>> entry3 = orderedPopulations.entrySet();
        for(Map.Entry<String, Long> entry: entry3) soma += entry.getValue();
        System.out.println("The total population between this states is: " + formatter.format(soma) + ".");

//        Display the average population of this states dictionary;
        System.out.println("The average population per state is: " + formatter.format((soma/orderedPopulations.size())));

//        Remove the states with a population smaller than 4,000,000;
        Iterator<Long> iterator = orderedPopulations.values().iterator();
        while (iterator.hasNext()) {
            if(iterator.next() < 4000000L)
                iterator.remove();
        }

        System.out.println(orderedPopulations);


//        Clear the states dictionary;
        orderedPopulations.clear();

//        Check if the dictionary is empty.
        System.out.println("Is it empty? " + orderedPopulations.isEmpty());
    }
}
