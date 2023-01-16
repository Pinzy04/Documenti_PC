#include<iostream>
using namespace std;

int main()
{
	float kg,pf;
	int km,tconsegna,pcons;
	cout<<"inserisci kg";
	cin>>kg;
	cout<<"inserisci km";
	cin>>km;
	cout<<"inserisci tempo";
	cin>>tconsegna;
	
	if(tconsegna=1)
	{
		pcons=35;
	}
	if(tconsegna>1 and tconsegna<=5)
	{
		pcons=20;
	}
	if(tconsegna>5)
	{
		pcons=5;
	}
	pf=kg*2+km*0.1+pcons;
	//cout<<"il prezzo del trasporto vale"<<pf;
	if(pf>200)
	{
		pcons=pcons*0.1;
		pf=pf-pcons;
	}
	cout<<"il prezzo del trasporto vale"<<pf;
}
