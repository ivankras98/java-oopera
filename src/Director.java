public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, Gender.gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public String getFullName() {
        return getName() + " " + getSurname();
    }
}