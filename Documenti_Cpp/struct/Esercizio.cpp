#include<iostream>
using namespace std;
int dim=5;

struct tennisti
{
    string cognome;
    int eta;
    int puntiatp;
};

int main()
{
    int i,somma=0,media,max,pos=0,min;
    tennisti giocatori[dim];
    for(i=0;i<dim;i++)
    {
        cout<<"Inserisci il cognome del tennista s"<<i+1<<endl;
        cin>>giocatori[i].cognome;
        cin>>giocatori[i].eta;
        cin>>giocatori[i].puntiatp;
    }
    for(i=0;i<dim;i++)
    {
        cout<<"Tennista: "<<giocatori[i].cognome<<endl;
        cout<<"Punti del tennista: "<<giocatori[i].puntiatp<<endl;
    }
    for(i=0;i<dim;i++)
    {
        somma=somma+giocatori[i].eta;
    }
    media=somma/dim;
    cout<<"L'eta' media dei tennisti e' "<<media<<endl;

    max=giocatori[0].puntiatp;
    for(i=1;i<dim;i++)
    {
        if(giocatori[i].puntiatp>max)
        {
            max=giocatori[i].puntiatp;
            pos=i;
        }
    }

    cout<<"Il tennista con la posizione piu' alta e' "<<giocatori[pos].puntiatp<<endl;

    min=giocatori[0].eta;
    pos=0;
    for(i=1;i<dim;i++)
    {
        if(giocatori[i].eta<min)
        {
            min=giocatori[i].eta;
            pos=i;
        }
    }
    cout<<"Il tennista più giovane e' "<<giocatori[pos].cognome<<endl;
    cout<<"Il suo punteggio e' "<<giocatori[pos].puntiatp;
}

