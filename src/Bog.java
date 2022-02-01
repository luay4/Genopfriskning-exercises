public class Bog {

    private String isbnNummer;
    private String titel;
    private String udgivelsesår;

    public Bog(String isbnNummer, String titel, String udgivelsesår) {
        this.isbnNummer = isbnNummer;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public String getIsbnNummer() {
        return isbnNummer;
    }

    public void setIsbnNummer(String isbnNummer) {
        this.isbnNummer = isbnNummer;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(String udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "isbnNummer='" + isbnNummer + '\'' +
                ", titel='" + titel + '\'' +
                ", udgivelsesår='" + udgivelsesår + '\'' +
                '}';
    }
}
