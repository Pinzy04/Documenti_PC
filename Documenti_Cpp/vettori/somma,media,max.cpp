#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;

int main(){
	srand(time(NULL));
	
	int numeri[100],i,somma=0,cont=0,max=0;
	float media,N=10;
	for(i=0;i<N;i++){
		numeri[i]=rand()%101;
		somma=somma+numeri[i];
		if(numeri[i]>max)
			max=numeri[i];
	}
	cout<<"la somma e' "<<somma<<endl;
	media=somma/N;
	cout<<"la media e' "<<media<<endl;
	for(i=0;i<N;i++){
		if(numeri[i]>media)
			cont++;
	}
	cout<<"i numeri superiori alla media sono "<<cont<<endl;
	cout<<"il numero piu' alto e' "<<max<<endl;
}
