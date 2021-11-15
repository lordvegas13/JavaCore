package Dz4;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayActions {
    public static void TheArray(List<String> array) {
        array.add("пам-пам");
        array.add("Пам-пам");
        array.add("ПАМ-ПАМ");
        array.add("Кутята");
        array.add("КутятА");
        array.add("жвачка");
        array.add("жвачка");
        array.add("жвачка");
        array.add("КУтятА");
        array.add("КУТЯТА");
        array.add("кутята");
        array.add("кутята");
        array.add("кутята");
        array.add("кутята");
        array.add("кутята");
    }


    public static void printUniqueWords(List<String> array) {
        Set<String> tempArray = new LinkedHashSet<>();
        for (String arr : array) {
            String a = arr.toLowerCase();
            tempArray.add(a);
        }
        for (String tempArr : tempArray) {
            int count = 0;
            for (String arr : array) {
                String a = arr.toLowerCase();
                if(tempArr.equals(a)) count++;
            }
            System.out.println("\"" + tempArr + "\"" + " повторяется в списке = " + count);
        }
        System.out.println();
    }

}
