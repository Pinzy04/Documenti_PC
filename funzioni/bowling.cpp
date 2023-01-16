#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int i,N=10,dim=30;

void carica(int v[]){
	for(i=0;i<N;i++){
		v[i]=rand()%11;
	}
}
	
int punteggio(int v[]){
	int somma=0;
	for(i=0;i<N;i++){
		somma=somma+v[i];
	}
	return somma;
}

int strike(int v[]){
	int cont=0;
	for(i=0;i<N;i++){
		if(v[i]==10){
			cont++;
		}
	}
	return cont;
}

int main(){
	
	srand(time(NULL));
	
	int i,vet1[dim],vet2[dim],vet3[dim],vet4[dim],max,massimo;
	string G1,G2,G3,G4;
	
	//nomi giocatori
	cout<<"inserire il nome del giocatore 1"<<endl;
	cin>>G1;
	cout<<"inserire il nome del giocatore 2"<<endl;
	cin>>G2;
	cout<<"inserire il nome del giocatore 3"<<endl;
	cin>>G3;
	cout<<"inserire il nome del giocatore 4"<<endl;
	cin>>G4;
	cout<<endl<<endl;
	
	//punteggi
	carica(vet1);
	carica(vet2);
	carica(vet3);
	carica(vet4);
	
	//lanci del bowling (rand)
	for(i=0;i<N;i++){
		cout<<"turno "<<i+1<<endl<<endl;
		
		cout<<G1<<" ha fatto "<<vet1[i]<<endl;	
		cout<<G2<<" ha fatto "<<vet2[i]<<endl;
		cout<<G3<<" ha fatto "<<vet3[i]<<endl;
		cout<<G4<<" ha fatto "<<vet4[i]<<endl;
		
		cout<<endl<<endl;
	}
	
	//vincitore
	max=punteggio(vet1);
	if(max<punteggio(vet2)){
		max=punteggio(vet2);
	}
	if(max<punteggio(vet3)){
		max=punteggio(vet3);
	}
	if(max<punteggio(vet4)){
		max=punteggio(vet4);
	}
	
	
	if(max==punteggio(vet1)){
		cout<<"il vincitore e' "<<G1<<endl<<endl;
	}
	if(max==punteggio(vet2)){
		cout<<"il vincitore e' "<<G2<<endl<<endl;
	}
	if(max==punteggio(vet3)){
		cout<<"il vincitore e' "<<G3<<endl<<endl;
	}
	if(max==punteggio(vet4)){
		cout<<"il vincitore e' "<<G4<<endl<<endl;
	}
	
	//chi ha fatto più volte strike
	massimo=strike(vet1);
	if(massimo<strike(vet2)){
		massimo=strike(vet2);
	}
	if(massimo<strike(vet3)){
		massimo=strike(vet3);
	}
	if(massimo<strike(vet4)){
		massimo=strike(vet4);
	}
	
	if(massimo==strike(vet1)){
		cout<<G1<<" ha fatto piu' strike"<<endl<<endl;
	}
	if(massimo==strike(vet2)){
		cout<<G2<<" ha fatto piu' strike"<<endl<<endl;
	}
	if(massimo==strike(vet3)){
		cout<<G3<<" ha fatto piu' strike"<<endl<<endl;
	}
	if(massimo==strike(vet4)){
		cout<<G4<<" ha fatto piu' strike"<<endl<<endl;
	}
	
	//punteggi
	cout<<"il punteggio di "<<G1<<" e' "<<punteggio(vet1)<<endl;
	cout<<G1<<" ha fatto "<<strike(vet1)<<" lanci da 10"<<endl<<endl;
	
	cout<<"il punteggio di "<<G2<<" e' "<<punteggio(vet2)<<endl;
	cout<<G2<<" ha fatto "<<strike(vet2)<<" lanci da 10"<<endl<<endl;
	
	cout<<"il punteggio di "<<G3<<" e' "<<punteggio(vet3)<<endl;
	cout<<G3<<" ha fatto "<<strike(vet3)<<" lanci da 10"<<endl<<endl;
	
	cout<<"il punteggio di "<<G4<<" e' "<<punteggio(vet4)<<endl;
	cout<<G4<<" ha fatto "<<strike(vet4)<<" lanci da 10"<<endl<<endl;
}
