package FavouriteLanguageExercise;

import java.util.Comparator;

public class CompareByNameYearIDE implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage o1, FavoriteLanguage o2) {
        int nameComparsion = o1.getName().compareTo(o2.getName());
        if (nameComparsion != 0) return nameComparsion;

        int yearComparison = Integer.compare(o1.getCreationYear(), o2.getCreationYear());
        if (yearComparison != 0) return yearComparison;

        return o1.getIDE().compareTo(o2.getIDE());
    }
}
