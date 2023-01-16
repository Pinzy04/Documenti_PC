package ProgArray;

import javax.lang.model.type.NullType;
import java.util.Scanner;

// autore Allasia

public class Studente {
    private String nome;
    private int Nvoti; //tiene conto di quanti voti ha preso lo studente
    private int vet[]; // vettore che contiene tutti i voti acquisiti

    public Studente(String nome,int N)
    { // costruttore a cui passo il nome e la dimensione del vettore dei voti
        this.nome=nome;
        this.Nvoti=0; //all'inizio lo studente non ha voti
        vet=new int[N];
    }

    public void SetNome(String nome)
    {
        this.nome=nome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public int Media()
    {
        int media=0;
        int i;
//ciclo che scansiona il vettore sommando i singoli voti
        for(i=0;i<this.Nvoti;i++)
        {
            media=media+vet[i];
        }
        return media/this.Nvoti; //ritorna la media dei voti
    }

    public void AssegnaVoto()
    {
        Scanner cin=new Scanner(System.in);
        System.out.print("Inserisci voto: ");
        vet[Nvoti]=cin.nextInt(); //carica il voto nella posizione corretta grazie alla variabile Nvoti
        this.Nvoti=this.Nvoti+1; //serve per aggiornare il numero di voti per poter gestire il vettore
    }

    //metodo che restituisce una stringa con il nome dello studente e la sua media
    public String StampaDati(Studente B)
    {
        return "nome: "+B.nome+"  ;  "+ "media: "+B.Media();
    }

    public void azzeraVoti(Studente B){
        for(int i = 0; i < Nvoti; i++)
        {
            B.vet[i] = 0;
        }
    }
}