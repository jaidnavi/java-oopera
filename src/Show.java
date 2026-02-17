import java.util.ArrayList;

public class Show {
    protected final String title;
    protected final int duration;
    protected final Director director;
    protected final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.director.numberOfShows++;
        this.listOfActors = new ArrayList<>();
    }

    public void addActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
        }
    }

    public void printActorList() {
        System.out.println("Список актеров для представления " + title + ":");
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void replaceActor(Actor actorToReplace, Actor actorReplacement) {

        if (listOfActors.contains(actorReplacement)) {
            System.out.println("В списке актеров представления " + title + " уже есть " + actorReplacement);
            return;
        }

        if (!listOfActors.contains(actorToReplace)) {
            System.out.println("В списке актеров представления " + title + " нет " + actorToReplace);
            return;
        }

        listOfActors.remove(actorToReplace);
        listOfActors.add(actorReplacement);
        System.out.println("В представлении " + title + actorToReplace + " заменен на " + actorReplacement);
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Представление " + title +
                " (" + duration + " мин.)" +
                ", " + director;
    }
}
