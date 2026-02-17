import java.util.Objects;

public class Actor extends Person {
    private final double height;

    public Actor(Gender gender, String firstName, String lastName, double height) {
        super(gender, firstName, lastName);
        this.height = height;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(firstName, actor.firstName) &&
                Objects.equals(lastName, actor.lastName);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (firstName != null) {
            // вычисляем хеш первого поля и добавляем к нему начальное значение
            hash = hash + firstName.hashCode();
        }
        hash = hash * 31; // умножаем промежуточный результат на простое число

        if (lastName != null) {
            // вычисляем хеш второго поля и добавляем его к общему результату
            hash = hash + lastName.hashCode();
        }
        return hash; // возвращаем итоговый хеш
    }

    @Override
    public String toString() {
        return "Актер " + firstName + " " + lastName +
                " (рост " + height + " метров)";
    }
}