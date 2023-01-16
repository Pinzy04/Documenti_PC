package Esercitazione;

public class Main {

    public static void main(String[] args) {
	    trasloco t1 = new trasloco(43, "Pippo", "Pluto", "19/01/2022");
        System.out.println("Codice cliente: " + t1.getCodice());
        System.out.println("Nome cliente: " + t1.getNome());
        System.out.println("Cognome cliente: " + t1.getCognome());
        System.out.println("Data trasloco: " + t1.getData());
    }
}
