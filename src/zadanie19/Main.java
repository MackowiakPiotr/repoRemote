package zadanie19;

public class Main {
    public static void main(String[] args) {


        Poem firstPoem = new Poem("Adam J", "Polska", 24);
        Poem secondPoem = new Poem("Jack J", "UK", 21);
        Poem thirdPoem = new Poem("Elizabeth P.", "USA", 12);

        Poem[] arrayOfPoems = {firstPoem, secondPoem, thirdPoem};
        int stropheChecker = arrayOfPoems[0].getStropheNumbers();
        int idx = 0;
        for (int i = 0; i < arrayOfPoems.length; i++) {

            if (stropheChecker < arrayOfPoems[i].getStropheNumbers()) {
                stropheChecker = arrayOfPoems[i].getStropheNumbers();
                idx = i;
            }
        }
        System.out.println("Autorem,któy napisał najwięcej zwrotek jest: " + arrayOfPoems[idx].getCreator().getSurname()
                + " z " + arrayOfPoems[idx].getCreator().getNationality());
    }
}
