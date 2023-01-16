#include<iostream>
using namespace std;

void carica(int v[],int i){
	cin>>v[i];
}

float media(int v[], int cont){
	int i,media=0;
	for(i=0;i<cont;i++){
		media=media+v[i];
	}
	media=media/cont;
	return media;
}

int main(){
	int i=0,scelta,vet[30];
	do{
		cout<<"Scegliere se inserire un vettore(1) o visualizzare la media dei numeri inseriti(2)."<<endl;
		cin>>scelta;
		switch(scelta){
			case 1:	cout<<"Inserire un numero nel vettore:"<<endl;
					carica(vet,i);
				break;
			case 2: cout<<"La media dei numeri inseriti e': "<<media(vet,i)<<endl;
				break;
			default:cout<<"Scelta non ammissibile."<<endl;
		}
		i++;
	}while(scelta!=2);
}
