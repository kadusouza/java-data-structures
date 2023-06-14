package ArrayListExercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Receive a semester worth of temperatures and display its average and the months with a higher value
//I overcomplicated the answer, but it works. keep it simple.
public class AvgTemperatureExercise {
    public static void main(String[] args) {
        MonthTemperature avgMonth;
        List<MonthTemperature> avgTemperatures = new ArrayList<MonthTemperature>();
        avgTemperatures.add(new MonthTemperature("January", 1, 28d));
        avgTemperatures.add(new MonthTemperature("February", 2, 28d));
        avgTemperatures.add(new MonthTemperature("March", 3, 27d));
        avgTemperatures.add(new MonthTemperature("April", 4, 26d));
        avgTemperatures.add(new MonthTemperature("May", 5, 23d));
        avgTemperatures.add(new MonthTemperature("June", 6, 22d));



        double soma = 0d;
        for (MonthTemperature avgTemp: avgTemperatures) {
            soma += avgTemp.getAvgTemp();
        }
        avgMonth = new MonthTemperature("AvgMonthSemester",13,(soma / 6));
        System.out.format("Average temperature in this semester: %.2f \n", avgMonth.getAvgTemp());



        Iterator<MonthTemperature> iterator = avgTemperatures.iterator();
        while (iterator.hasNext()) {
            MonthTemperature next = iterator.next();
            if (next.compareTo(avgMonth) > 0)
                System.out.println(next.toString());
        }




    }

}

class MonthTemperature implements Comparable<MonthTemperature> {
    private String name;
    private int number;
    private double avgTemp;

    public MonthTemperature(String name, int number, double avgTemp) {
        this.name = name;
        this.number = number;
        this.avgTemp = avgTemp;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public double getAvgTemp() {
        return avgTemp;
    }

    @Override
    public String toString() {
        return   number +
                " - " + name  +
                " - Average temperature: " + avgTemp;
    }

    @Override
    public int compareTo(MonthTemperature obj) {
        return Double.compare(this.getAvgTemp(), obj.avgTemp);
    }
}


