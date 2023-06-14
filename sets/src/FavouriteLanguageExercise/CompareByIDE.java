package FavouriteLanguageExercise;

import java.util.Comparator;

public class CompareByIDE implements Comparator<FavoriteLanguage> {
    @Override
    public int compare(FavoriteLanguage o1, FavoriteLanguage o2) {
        return o1.getIDE().compareTo(o2.getIDE());
    }
}
