#include<iostream>
#include<stdlib.h>
using namespace std;
int visualizzaVettore(int vet[],int dim){
    for(i=0;i<dim;i++)
    cout<<vet[i]<<endl;
}

void visualizza(int vet[],int dim){

}

void binario(int g){
    int resto[4],i=3;
    do{                   3 2 1 0
        resto[i]=g%2;   //1 0 0 1
        g=g/2;          //4 2 1 0
        i--;
    }while(g!=0);

    for(i=0;i<4;i++){
            cout<<resto[i];
    }
    cout<<" ";
}
int main(){
    char gg[2],gA; //giorno in un vettore di caratteri
    int giorno,gI,i,dim=4,vet[dim]; //giorno in numeri interi
do{
    cout<<"inserisci la data di nascita"<<endl;
    cin>>gg;

    //conversione  vettore di caratteri in un vettore di numeri(atoi=ascii to integer)
    giorno=atoi(gg);

    if(giorno<1 || giorno>31){
        cout<<"non puoi essere nato in un giorno non compreso tra 1 e 31"<<endl;
    }
    else{
        for(i=0;i<2;i++){
            gA=gg[i];
            gI=(int)gA;     //conversione carattere da asci a intero
            binario(gI);    //richiamo la funzione per scriverlo in binario
        }
    }
}while(giorno<1 || giorno>31);
    visualizza(vet,dim);
}
