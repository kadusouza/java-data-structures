package FavouriteLanguageExercise;

import java.util.Comparator;

public class FavoriteLanguage implements Comparable<FavoriteLanguage> {
    private String name;
    private int creationYear;
    private String IDE;

    public FavoriteLanguage(String name, int creationYear, String IDE) {
        this.name = name;
        this.creationYear = creationYear;
        this.IDE = IDE;
    }

    public String getName() {
        return name;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public String getIDE() {
        return IDE;
    }

    @Override
    public String toString() {
        return
                "Name='" + name + '\'' +
                ", creationYear=" + creationYear +
                ", IDE='" + IDE + '\'' + "|";
    }

    @Override
    public int compareTo(FavoriteLanguage o) {
        return this.getName().compareTo(o.getName());
    }

}


