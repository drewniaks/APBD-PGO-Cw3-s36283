public class ProduktMenu {
    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;

    private static int liczbaProduktow = 0;

    public ProduktMenu(String kod, String nazwa, double cena, String kategoria) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        liczbaProduktow++;
    }

    public String getKod() { return kod; }
    public String getNazwa() { return nazwa; }
    public double getCena() { return cena; }
    public String getKategoria() { return kategoria; }

    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }

    @Override
    public String toString() {
        return nazwa + " (" + kod + ") - " + cena + " zł [" + kategoria + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ProduktMenu)) return false;

        ProduktMenu other = (ProduktMenu) obj;
        return this.kod.equals(other.kod);
    }
}

