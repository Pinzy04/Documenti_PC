#include<iostream>
using namespace std;
int N=0;
const int dim=3;

struct Auto
{
    char marca[50];
    int cilindrata;
    int anno;
    char nome[30];
    char cognome[30];
};


void datiAuto(struct autosalone[])
{
    cout<<"inserisci marca: ";
        cin>>autosalone[N].marca;
    cout<<"inserisci cilindrata: ";
        cin>>autosalone[N].cilindrata;
    cout<<"inserisci anno: ";
        cin>>autosalone[N].anno;
    cout<<"inserisci nome: ";
        cin>>autosalone[N].nome;
    cout<<"inserisci cognome: ";
        cin>>autosalone[N].cognome;
    N++;
}

void cognomi(struct autosalone[])
{
    int i;
    for(i=0;i<N;i++)
    {
        cout<<autosalone[i].cognome<<endl;
    }
}

void ricercaAnno(struct autosalone[])
{
    int anno,i;
    cout<<"inserisci anno da cercare"<<endl;
        cin>>anno;
    for(i=0;i<N;i++)
    {
        if(anno==autosalone[i].anno)
        {
            cout<<autosalone[i].marca<<endl;
            cout<<autosalone[i].cilindrata<<endl;
            cout<<autosalone[i].anno<<endl;
            cout<<autosalone[i].cognome<<endl;
            cout<<autosalone[i].nome<<endl;
        }
    }
}


int main()
{
    int scelta;
    Auto autosalone[dim];
    do
    {
        cout<<"premere 1 per inserire i dati di un auto, 2 per visualizzare tutti gli acquirenti, 3 per visualizzare i dati delle auto di un anno a scelta e 4 per terminare il programma"<<endl;
        switch(scelta)
        {
            case 1:
                datiAuto(autosalone);
                break;
            case 2:
                cognomi(autosalone);
                break;
            case 3:
                ricercaAnno(autosalone);
                break;
            case 4:
                cout<<"programma terminato";
                break;
            default:
                cout<<"opzione non accettata";
                break;
    }
    while(scelta!=4);
}
