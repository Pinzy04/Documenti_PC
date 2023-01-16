#include<iostream>
using namespace std;
int num;

void carica(int v[]){
	int i;
	for(i=0;i<10;i++){
		cin>>v[i];
	}
}

void stampa(int v[]){
	int i;
	for(i=0;i<10;i++){
		cout<<v[i]<<endl;
	}
}

int minimo(int v[]){
	int min=v[0],i;
	for(i=0;i<10;i++){
		if(v[i]<min)
			min=v[i];
	}
	return min;
}

int ricercanumero(int v[]){
	int i,cont=0;
	for(i=0;i<10;i++){
		if(v[i]==num)
			cont++;
	}
	return cont;
}

int somma(int v[]){
	int i,somma=0;
	for(i=0;i<10;i++){
		somma=somma+v[i];
	}
	return somma;
}

int toglielemento(int v[]){
	
}

int main(){
	int vet[30];
	
	cout<<"inserire i numeri nel vettore: "<<endl;
	carica(vet);
	cout<<"i numeri inseriti nel vettore sono: "<<endl;
	stampa(vet);
	cout<<"il minimo e': "<<minimo(vet)<<endl;
	cout<<"inserire il numero di cui si vole sapere qunte volte viene ripetuto nel vettore: "<<endl;
	cin>>num;
	cout<<"il numero "<<num<<" e' stato ripetuto "<<ricercanumero(vet)<<" volte"<<endl;
	cout<<"la somma e' "<<somma(vet)<<endl;
	cout<<"inserire il numero da rimuovere dal vettore: "<<endl;
	cin>>num;
}
