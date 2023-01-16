package ProgCasaEditrice;

public class Periodico extends Pubblicazione {
    private String direttore;
    private int periodicita;

    Periodico(){
        super();
        System.out.println("inserisci il nome del direttore");
        direttore = in.nextLine();
        System.out.println("inserisci la periodicità");
        periodicita = in.nextInt();
        tipo = "periodico";
    }


    public String toString() {
        return "(periodico): titolo='" + titolo +", prezzo=" + prezzo + ", direttore='" + direttore + ", periodicità=" + periodicita + ";";
    }
}
