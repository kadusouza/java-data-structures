package FavouriteLanguageExercise;

import java.util.Comparator;

public class CompareByYearName implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage o1, FavoriteLanguage o2) {
        int yearComparison = Integer.compare(o1.getCreationYear(), o2.getCreationYear());
        if (yearComparison != 0) {
            return yearComparison;
        }
        return o1.getName().compareTo(o2.getName());
    }
}
