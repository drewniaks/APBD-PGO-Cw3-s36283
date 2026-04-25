public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String getPelneDane() {
        return imie + " " + nazwisko + " (" + email + ")";
    }

    public String toString() {
        return "Klient ID: " + idKlienta + ", " + getPelneDane();
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof KlientKawiarni)) return false;

        KlientKawiarni other = (KlientKawiarni) obj;
        return this.email.equals(other.email);
    }
}