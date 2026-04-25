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
        this.oplacone = false;
        this.numerZamowienia = generujNumerZamowienia();
    }

    private static int generujNumerZamowienia() {
        return kolejnyNumer++;
    }

    public void dodajProdukt(ProduktMenu produkt) {
        produkty.add(produkt);
    }

    public double policzWartosc() {
        double suma = 0.0;
        for (ProduktMenu produkt : produkty) {
            suma += produkt.getCena();
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
        String status = oplacone ? "Opłacone" : "Nieopłacone";
        StringBuilder sb = new StringBuilder();
        sb.append("=== Zamówienie nr ").append(numerZamowienia).append(" ===\n");
        sb.append("Status: ").append(status).append("\n");
        sb.append(klient.toString()).append("\n");
        sb.append("Produkty:\n");
        for (ProduktMenu p : produkty) {
            sb.append(" - ").append(p.toString()).append("\n");
        }
        sb.append("=======================");
        
        return sb.toString();
    }
}