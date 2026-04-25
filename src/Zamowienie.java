import java.util.ArrayList;

public class Zamowienie {
    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;

    private static int kolejnyNumer = 1;

    public Zamowienie(KlientKawiarni klient) {
        this.klient = klient;
        this.produkty = new ArrayList<>();
        this.numerZamowienia = kolejnyNumer++;
        this.oplacone = false;
    }

    public void dodajProdukt(ProduktMenu produkt) {
        produkty.add(produkt);
    }

    public double policzWartosc() {
        double suma = 0;
        for (ProduktMenu p : produkty) {
            suma += p.getCena();
        }
        return suma;
    }

    public int policzLiczbeProduktow() {
        return produkty.size();
    }

    public void oznaczJakoOplacone() {
        this.oplacone = true;
    }

    public String toString() {
        String wynik = "Zamówienie nr " + numerZamowienia + "\n";
        wynik += "Klient: " + klient + "\n";
        wynik += "Produkty:\n";

        for (ProduktMenu p : produkty) {
            wynik += " - " + p + "\n";
        }

        wynik += "Status: " + (oplacone ? "OPŁACONE" : "NIEOPŁACONE");
        return wynik;
    }
}