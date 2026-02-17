public class Person {
    protected final Gender gender;
    protected final String firstName;
    protected final String lastName;

    public Person(Gender gender, String firstName, String lastName) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
