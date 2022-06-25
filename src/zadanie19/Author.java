package zadanie19;

public class Author {
    private final String surname;
    private final String nationality;

    public Author(String surname, String nationality){
        this.surname = surname;
        this.nationality = nationality;
    }

    public String getSurname() {
        return surname;
    }

    public String getNationality() {
        return nationality;
    }
}
