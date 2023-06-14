package FavouriteLanguageExercise;

import java.awt.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
Create a class called FavoriteLanguage that has the attributes name, creationYear, and IDE.
Then, create a set with 3 languages and write a program to sort this set by:
Insertion Order
Natural Order (name)
IDE
Creation year and name
Name, creation year, and IDE
Finally, display the languages in the console, one below the other.
*/
public class Main {
    public static void main(String[] args) {
//        HashSet<FavoriteLanguage> languages = new HashSet<>();//Random Order
        LinkedHashSet<FavoriteLanguage> languages = new LinkedHashSet<>();// Insertion Order
        languages.add(new FavoriteLanguage("Java", 1996, "Intellij"));
        languages.add(new FavoriteLanguage("C", 1978, "Eclipse"));
        languages.add(new FavoriteLanguage("Flutter", 2017, "Vscode"));

        System.out.println("Languages in insertion order:\n" + languages.toString());

        TreeSet<FavoriteLanguage> naturalOrderLanguages = new TreeSet<>(languages);
        System.out.println("Languages in natural order (name):\n" + naturalOrderLanguages);

        TreeSet<FavoriteLanguage> IDEOrderLanguages = new TreeSet<>(new CompareByIDE());
        IDEOrderLanguages.addAll(languages);
        System.out.println("Languages in IDE order:\n" + IDEOrderLanguages);

        TreeSet<FavoriteLanguage> YearNameOrderLanguages = new TreeSet<>(new CompareByYearName());
        YearNameOrderLanguages.addAll(languages);
        System.out.println("Languages in Year order, with the name deciding if they tie:\n" + YearNameOrderLanguages);

        TreeSet<FavoriteLanguage> nameYearIdeOrderLanguages = new TreeSet<>(new CompareByNameYearIDE());
        nameYearIdeOrderLanguages.addAll(languages);
        System.out.println("Languages in Name order, followed by, Year and then IDE order:\n" + nameYearIdeOrderLanguages);

        System.out.println("Displaying languages: ");
        for (FavoriteLanguage language: nameYearIdeOrderLanguages) System.out.println(language);

    }

}
