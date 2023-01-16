#include<iostream>
using namespace std;

int main(){
	const int DIM=30; //dimensione del vettore(quante posizioni ha)
	int numeri[DIM],i,N=0,cont=0; //N tiene conto dei valori inseriti
	cout<<"inserisci il primo numero"<<endl;
	cin>>numeri[0];
	N++;
	cout<<"inserisci il secondo numero"<<endl;
	cin<<numeri[1];
	N++;
	for(i=0;i<N;i++){
		cout<<numeri[i]<<endl;
	}
	N=10;
	for(i=0;i<N;i++){
		numeri[i]=rand()%21-10;
	}
		for(i=0;i<N;i++){
		cout<<i<<" "<<numeri[i]<<endl;
	}
	for(i=0;i<N;i++){
		if(numeri[i]==9)
			cont++;
	}
	cout<<"si ripete "<<cont<<" volte"<<endl;
}
