package progUfficioPostale;

import java.util.*;

public class Main {
    private static Queue Postale = new LinkedList();
    private static Queue Finanziaria = new LinkedList();
    private static Queue Pagamenti = new LinkedList();
    private static int A = 0, B = 0, C = 0;

    public static void main(String[] args) {
        int scelta;
        Scanner in = new Scanner(System.in);
        scriviFile a = new scriviFile();
        leggiFile b = new leggiFile();

        do {
            System.out.println("1. Nuovo cliente.");
            System.out.println("2. Un cliente viene servito.");
            System.out.println("3. Mostra il tabellone");
            System.out.println("4. Esci dall'ufficio postale");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    inserimento();
                    break;
                case 2:
                    estrazione(a);
                    break;
                case 3:
                    b.leggeToken();
                case 4:
                    System.out.println("Stai uscendo...");
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }
        }while(scelta != 4);
    }


    public static void inserimento(){
        Scanner in = new Scanner(System.in);
        int tipo;
        do{
            System.out.println("Scegli la tipologia di operazione: postale(1), finanziaria(2), pagamenti(3).");
            tipo = in.nextInt();
            switch (tipo) {
                case 1:
                    Postale.add(A);
                    A++;
                    System.out.println("La coda postale ha " + Postale.size() + " clienti");
                    break;
                case 2:
                    Finanziaria.add(B);
                    B++;
                    System.out.println("La coda finanziaria ha " + Finanziaria.size() + " clienti");
                    break;
                case 3:
                    Pagamenti.add(C);
                    C++;
                    System.out.println("La coda pagamenti ha " + Pagamenti.size() + " clienti");
                    break;
                default:
                    System.out.println("Scelta inesistente");
                    break;
            }
        }while(tipo < 1 && tipo > 3);
    }


    public static void estrazione(scriviFile a){
        int rand = (int)(Math.random()*5+1);
        if(Postale.size() > 0){
            a.dati(("A"+ A), "Postale", rand );
            a.scrivi();
            System.out.println("Il cliente A" + Postale.poll() + " della coda postale è stato servito allo sportello " + rand);
        }
        else if(Finanziaria.size() > 0){
            a.dati(("B"+ B), "Finanziaria", rand );
            a.scrivi();
            System.out.println("Il cliente B" + Finanziaria.poll() + " della coda finanziaria è stato servito allo sportello " + rand);
        }
        else if(Pagamenti.size() > 0){
            a.dati(("C"+ C), "Pagamenti", rand );
            a.scrivi();
            System.out.println("Il cliente C" + Pagamenti.poll() + " della coda pagamenti è stato servito allo sportello " + rand);
        }
        else{
            System.out.println("Non ci sono più clienti");
        }
    }
}