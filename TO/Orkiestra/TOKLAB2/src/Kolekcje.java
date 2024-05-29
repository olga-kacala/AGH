
import java.util.ArrayList;
import java.util.HashSet;

public class Kolekcje {
    public static void main(String[] args) {
        String[] namesList = new String[] { "Staś", "Ola", "Asia", "Basia", "Jaś", "Ola", "Ela", "Ela", "Ewa", "Ala" };
        ArrayList<String> personsArr = new ArrayList<>();

        System.out.println("for each");
        for (String name1 : namesList) {
            personsArr.add(name1);
        }
        System.out.println("hashset");
        HashSet<String> namesSet = new HashSet<>();
        for (String name1 : namesList) {
            namesSet.add(name1);
        }
        System.out.println(personsArr);
        System.out.println(namesSet);

        System.out.println("Trzecia osoba ze zbioru: " + personsArr.get(2));
        //
        int count = 0;
        for (String name : namesSet) {
            if (count == 2) {
                System.out.println(name);
                break;
            }
            count++;
        }

    }
}