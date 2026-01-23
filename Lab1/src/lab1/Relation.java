package lab1;

public class Relation {
    private String relationshipType; // Sister, Brother, Mother, Father

    public Relation(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    public void showRelationShip(Person p1, Person p2) {
        System.out.println("Relationship between " + p1.getFirstName() + " and " + p2.getFirstName()
                + " is: " + relationshipType);
    }
}