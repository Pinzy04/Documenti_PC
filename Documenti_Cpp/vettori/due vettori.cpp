#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;

int main(){
	srand(time(NULL));
	
	int i,vettore[10],cont=0,contp=0,somma=0,media,vettore2[3];
	for(i=0;i<10;i++){
		vettore[i]=rand()%50;
		somma=somma+vettore[i];
		cont++;
		if(vettore[i]%2==0)
			contp++;
	}
	media=somma/cont;
	
	vettore2[0]=somma;
	vettore2[1]=media;
	vettore2[2]=contp;
	cout<<"primo vettore"<<endl;
	for(i=0;i<10;i++){
		cout<<vettore[i]<<endl;
	}
	cout<<"secondo vettore"<<endl;
	for(i=0;i<3;i++){
		cout<<vettore2[i]<<endl;
	}
}
