#include<iostream>
#include<string>
#define N 5
using namespace std;
//variabile globale
int dati[N][5]={{12,7,4,3,1},{34,3,0,5,3},{10,13,9,1,0},{22,6,1,7,4},{11,10,7,2,0}};

//funzione per calcolare i gol di attaccanti, centrocampisti e difensori
int goal(char ruolo[],int r){
    int i,somma=0;
    for(i=0;i<N;i++){
        if(ruolo[i]==r)
            somma=somma+dati[i][1];
    }
    return somma;
}

//funzione per calcolare i gol totali
int goaltot(){
    int i,somma=0;
    for(i=0;i<N;i++){
        somma=somma+dati[i][1];
    }
    return somma;
}
int main(){
    //dichiarazione variabili e assegnazione
    string giocatore,nomi[N]={"Giovanni","Alberto","Pietro","Franco","Matteo"};
    char r,ruolo[N]={'C','D','A','C','A'};
    int i,pos,ammonizioni,espulsioni,scelta,riga;
    bool esiste=false;

    do{
        cout<<"Premere 1 per vedere quanti goal hanno fatto gli attaccanti."<<endl;
        cout<<"Premere 2 per vedere quanti goal hannno fatto i centrocampisti."<<endl;
        cout<<"Premere 3 per vedere quanti goal hannno fatto i difensori."<<endl;
        cout<<"Premere 4 per vedere quanti goal sono stati fatti in totale."<<endl;
        cout<<"Premere 5 per vedere quante ammonizioni ed espulsioni ha avuto un giocatore a scelta."<<endl;
        cout<<"Premere 6 per terminare il programma."<<endl;
        cin>>scelta;
        switch(scelta){
            case 1: r='A';
                    cout<<"i goal segnati dagli attaccanti sono "<<goal(ruolo,r)<<endl<<endl;
                    break;

            case 2: r='C';
                    cout<<"i goal segnati dai centrocampisti sono "<<goal(ruolo,r)<<endl<<endl;
                    break;

            case 3: r='D';
                    cout<<"i goal segnati dai difensori sono "<<goal(ruolo,r)<<endl<<endl;
                    break;

            case 4: cout<<"i goal segnati in totale sono "<<goaltot()<<endl<<endl;
                    break;

            case 5: cout<<"I giocatori sono: "<<endl;
                    for(i=0;i<N;i++){
                        cout<<nomi[i]<<endl;
                    }
                    cout<<"scegliere il giocatore di cui si vuole sapere il giocatore: "<<endl;
                    do{
                        cin>>giocatore;
                        for(i=0;i<N;i++){
                            if(nomi[i]==giocatore){
                                esiste=true;
                                pos=i;
                            }
                            if(i==N-1){
                                cout<<"Giocatore non trovato"<<endl;
                            }
                        }
                    }while(esiste==false);
                    ammonizioni=dati[pos][3];
                    espulsioni=dati[pos][4];
                    cout<<"il giocatore ha avuto "<<ammonizioni<<" ammonizioni e "<<espulsioni<<" espulsioni"<<endl<<endl;
                    break;

            case 6: cout<<"Termina il programma"<<endl<<endl;
                    break;

            default:cout<<"Scelta non ammissibile"<<endl<<endl;
        }
    }while(scelta!=6);
}
