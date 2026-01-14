package lab1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person ian  = new Person(1, "Ian",  "Brooks",  "Red",    30, true);
        Person gina = new Person(2, "Gina", "James",   "Green",  18, false);
        Person mike = new Person(3, "Mike", "Briscoe", "Blue",   45, true);
        Person mary = new Person(4, "Mary", "Beals",   "Yellow", 28, true);

        // 1) Display Gina’s info as a sentence
        gina.displayPersonInfo();

        // 2) Display all of Mike’s info
        System.out.println(mike);

        // 3) Change Ian’s favourite colour to white, then print sentence
        ian.changeFavoriteColour();
        ian.displayPersonInfo();

        // 4) Display Mary’s age after ten years
        System.out.println(mary.getFirstName() + " Beals's Age in 10 years is: " + mary.getAgeInTenYears());

        // 5) Relationships
        Relation sisters = new Relation("Sisterhood");
        sisters.showRelationShip(gina, mary);

        Relation brothers = new Relation("Brotherhood");
        brothers.showRelationShip(ian, mike);

        // 6) Add all Person objects to a list
        List<Person> people = new ArrayList<>();
        people.add(ian);
        people.add(gina);
        people.add(mike);
        people.add(mary);

        // Average age
        int totalAge = 0;

        for (Person p : people) {
            totalAge += p.getAge();
        }

        double average = (double) totalAge / people.size();
        System.out.println("Average age is " + average);

        // Youngest and oldest

        Person youngest = people.get(0);
        Person oldest = people.get(0);

        for (Person p : people) {
            if (p.getAge() < youngest.getAge()) {
                youngest = p;
            }
            if (p.getAge() > oldest.getAge()) {
                oldest = p;
            }
        }

        System.out.println("The youngest person is: " + youngest.getFirstName());
        System.out.println("The oldest person is: " + oldest.getFirstName());

        // Names starting with M

        for (Person p : people) {
            if (p.getFirstName().startsWith("M")) {
                System.out.println(p.getFirstName() + " " + p.getLastName() + "'s first name starts with with M");
            }
        }

        // Person who likes the colour blue
        people.stream()
                .filter(p -> p.getFavoriteColour().equalsIgnoreCase("Blue"))
                .forEach(System.out::println);
    }
}
