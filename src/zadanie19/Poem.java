package zadanie19;

public class Poem {

    private final int stropheNumbers;
    private final Author creator;
    public Poem(String authorSurname,String nationality, int stropheNumbers){
        this.creator = new Author(authorSurname,nationality);
        this.stropheNumbers = stropheNumbers;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public Author getCreator() {
        return creator;
    }
}
