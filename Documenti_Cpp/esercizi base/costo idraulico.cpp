#include <iostream>
using namespace std;

int main()
{
	float hl,h,pm,pfm,pf;
	//hl=prezzo ora di lavoro, h=ore di lavoro, pm=prezzo materiale, pfm=prezzo finale minimo, pf=prezzo finale
	
	hl=40.00;
	pfm=100.00;
	cout<<"inserire le ore di lavoro:"<<endl;
	cin>>h;
	cout<<"inserire il prezzo del materiale:"<<endl;
	cin>>pm;
	
	pf=(hl*h)+pm;
	
	if(pf<pfm)
	{
		cout<<"l'importo e' "<<pf<<" euro, non raggiunge 100.00 euro, quindi non e' possibile fare il lavoro."<<endl;
	}
	else
	{
		cout<<"il prezzo finale e' "<<pf<<" euro.";
	}
}
