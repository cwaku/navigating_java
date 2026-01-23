package lab1;

public class Person {
    private int personId;
    private String firstName;
    private String lastName;
    private String favoriteColour;
    private int age;
    private boolean isWorking;

    public Person(int personId, String firstName, String lastName, String favoriteColour, int age, boolean isWorking) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.favoriteColour = favoriteColour;
        this.age = age;
        this.isWorking = isWorking;
    }

    public void displayPersonInfo() {
        System.out.println(personId + ": " + firstName + " " + lastName + "'s favorite colour is " + favoriteColour);
    }

    public void changeFavoriteColour() {
        this.favoriteColour = "White";
    }

    public int getAgeInTenYears() {
        return this.age + 10;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public int getAge() { return age; }
    public String getFavoriteColour() { return favoriteColour; }

    @Override
    public String toString() {
        return "PersonId: " + personId +
                "\nFirstName: " + firstName +
                "\nLastName: " + lastName +
                "\nFavoriteColour: " + favoriteColour +
                "\nAge: " + age +
                "\nIsWorking: " + isWorking;
    }
}