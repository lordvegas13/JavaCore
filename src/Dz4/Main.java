package Dz4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> wordArray = new ArrayList<>();
        ArrayActions.TheArray(wordArray);
        ArrayActions.printUniqueWords(wordArray);

        Phonebook phonebook = new Phonebook();

        phonebook.add(1111111, "Носочек");
        phonebook.add(2222222, "Носочек");
        phonebook.add(3333333, "Петушок");
        phonebook.add(4444444, "Галина");
        phonebook.add(5555555, "Галина");
        phonebook.add(6666666, "Галина");

        phonebook.get("Носочек");
        phonebook.get("Петушок");
        phonebook.get("Галина");
        phonebook.get("Петунья");

    }
}
