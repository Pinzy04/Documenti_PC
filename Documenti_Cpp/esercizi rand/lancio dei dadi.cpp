#include <iostream>
#include <cstdlib>

using namespace std;

int main()
{
	cout<<"viene simulato il lancio di due dadi in cui essi vengono sommati, se i numeri estratti sono uguali allora il risultato della somma dei due viene raddoppiato."<<endl;
	
	int d1,d2,ris;
	
	ris=0;
	d1=0;
	d2=0;
	
	d1=rand()%6 + 1;
	d2=rand()%6 + 1;
	
	cout<<"d1 vale "<<d1<<endl;
	cout<<"d2 vale "<<d2<<endl;
	if(d1==d2)
	{
		ris=(d1+d2)*2;
	}
	else
	{
		ris=d1+d2;
	}
	cout<<"il risultato e' "<<ris;
}
