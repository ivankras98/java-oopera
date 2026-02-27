import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();
    }

    public void printDirectorInfo() {
        System.out.println("Режиссёр: " + director.getFullName());
    }

    public void printActorsList() {
        System.out.println("Актёры спектакля \"" + title + "\":");
        if (listOfActors.isEmpty()) {
            System.out.println("  Список актёров пуст");
        } else {
            for (Actor actor : listOfActors) {
                System.out.println("  " + actor);
            }
        }
    }

    public boolean addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor + " уже есть в спектакле");
            return false;
        }
        listOfActors.add(actor);
        System.out.println("Актёр " + actor + " добавлен в спектакль");
        return true;
    }

    public boolean replaceActor(String surnameToReplace, Actor newActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameToReplace)) {
                if (listOfActors.contains(newActor)) {
                    System.out.println("Актёр " + newActor + " уже есть в спектакле");
                    return false;
                }
                Actor removed = listOfActors.set(i, newActor);
                System.out.println("Актёр " + removed + " заменён на " + newActor);
                return true;
            }
        }
        System.out.println("Актёр с фамилией " + surnameToReplace + " не найден");
        return false;
    }

    public String getTitle() {
        return title;
    }
}