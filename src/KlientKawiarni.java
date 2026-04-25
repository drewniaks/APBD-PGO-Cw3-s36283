import java.util.Objects;

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

    public String pobierzPelneDane() {
        return imie + " " + nazwisko + " (Email: " + email + ")";
    }

    public String toString() {
        return "Klient [ID: " + idKlienta + "] " + pobierzPelneDane();
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        KlientKawiarni klient = (KlientKawiarni) o;
        return idKlienta == klient.idKlienta;
    }
}