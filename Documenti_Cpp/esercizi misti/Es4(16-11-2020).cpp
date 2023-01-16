#include<iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main()
{
	srand(time(NULL));
	
	int d1=0,d2=0,ris=0,cont=0;
	
	do{
		cout<<"lancio dei due dadi"<<endl;
		d1=rand()%6 + 1;
		d2=rand()%6 + 1;
		ris=d1+d2;
		cont++;
		cout<<"il primo dado e' "<<d1<<endl;
		cout<<"il secondo dado e' "<<d2<<endl;
		cout<<"il risultato e' "<<ris<<endl;
	}while((d1!=6)&&(d2=d1));
	cout<<"i dadi sono entrambi 6, i tentativi sono stati "<<cont;
}
