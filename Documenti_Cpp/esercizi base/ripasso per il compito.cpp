#include <iostream>
using namespace std;

int main()
{
	int sog,tgg,pp,np,gg,prezzo;
	float pf;
	//sog=soggiorno, tgg=tenda al giorno, pp=posto a persona, np=numero di persone, gg=gioirni, pf=prezzo finale
	sog=50;
	tgg=10;
	pp=20;
	
	cout<<"inserire il numero delle persone"<<endl;
	cin>>np;
	cout<<"inserire i giorni di soggiorno"<<endl;
	cin>>gg;
	
	prezzo=pp*np;
	if(np>=4)
	{
		prezzo=prezzo*0.8;
	}
	
	pf=sog+(tgg*gg)+(prezzo);
	
	if(gg>7)
	{
		pf=pf*0.9;
	}
	
	cout<<"il prezzo finale e' "<<pf<<" euro";
}
