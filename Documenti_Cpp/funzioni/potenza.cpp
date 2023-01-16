#include<iostream>
using namespace std;

int potenza(int b,int e){
	int i,risultato=1;
	if(e>0){
		for(i=0;i<e;i++){
			risultato=risultato*b;
		}
	}
	if(e=0){
		risultato=1;
	}
	
	return risultato;
}

int main(){
	int base,esponente;
	cout<<"Es 2"<<endl<<"inserire la base: ";
	cin>>base;
	cout<<"inserire l'esponente: ";
	cin>>esponente;
	if(esponente>=0){
		cout<<"il risultato e': "<<potenza(base,esponente);
	}
	else{
		cout<<"Errore, l'esponente e' minore di 0";
	}
}
