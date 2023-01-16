#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main()
{
	srand(time(NULL));
	
	cout<<"viene visualizzato il risultato della somma di due dadi. Se escono due numeri pari ho un bonus di +1, se escono due numeri dispari il bonus sara' di +2. In caso i numeri fossero uguali verra' aggiunto un +4 insieme ad altri eventuali bonus."<<endl;
	
	int d1,d2,ris;
	
	d1=0;
	d2=0;
	ris=0;
	
	d1=rand()%6 + 1;
	d2=rand()%6 + 1;
	ris=(d1+d2);
	
	cout<<"il primo dado vale "<<d1<<endl;
	cout<<"il secondo dado vale "<<d2<<endl;
	
	if(d1%2==0 && d2%2==0)
	{
		ris++;
	}
	
	if(d1%2==1 && d2%2==1)
	{
		ris=ris+2;
	}
	
	if(d1==d2)
	{
		ris=ris+4;
	}
	
	cout<<"il risultato e' "<<ris;
}
