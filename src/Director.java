public class Director extends Person {
    public int numberOfShows;

    public Director(Gender gender, String firstName, String lastName) {
        super(gender, firstName, lastName);
        this.numberOfShows = 0;
    }

    @Override
    public String toString() {
        return "Режиссер " + firstName + " " + lastName + " (режиссирует " + numberOfShows + " представления)";
    }
}
