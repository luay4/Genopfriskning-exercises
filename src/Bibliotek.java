import java.util.ArrayList;

public class Bibliotek {

    private ArrayList<Bog> bøger = new ArrayList<>();

    public boolean findesBogiBibliotek(Bog bog) {
        for (Bog bibBog : bøger) {
            if (bibBog.getIsbnNummer().equals(bog.getIsbnNummer())) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Bibliotek bibliotek = new Bibliotek();
        Bog bog1 = new Bog("1234", "Biblen", "0");
        Bog bog2 = new Bog("5236", "Hvordan man tilbereder en haj", "1780");
        Bog bog3 = new Bog("9873", "Peppa pig", "2001");
        Bog bog4 = new Bog("9872", "Den grimme ælling", "1869");

        bibliotek.bøger.add(bog1);
        bibliotek.bøger.add(bog2);
        bibliotek.bøger.add(bog3);

        boolean result = bibliotek.findesBogiBibliotek(bog4);
        System.out.println(result);
    }
}
