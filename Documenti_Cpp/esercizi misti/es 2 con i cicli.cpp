#include<iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
	srand(time(NULL));
	
	int d1,d2,d3,d4,p1=0,p2=0,ris1,ris2;
	string g1,g2;
	
	cout<<"inserire il nome del giocatore 1"<<endl;
	cin>>g1;
	cout<<"inserire il nome del giocatore 2"<<endl;
	cin>>g2;
	
	do{
	
	d1=rand()%6 + 1;
	d2=rand()%6 + 1;
	
	ris1=d1+d2;
	p1=p1+ris1;
	
	d3=rand()%6 + 1;
	d4=rand()%6 + 1;
	
	ris2=d3+d4;
	p2=p2+ris2;
	
	}while((p1<=100)&&(p2<=100));
	
	cout<<"il punteggio di "<<g1<<" e' "<<p1<<endl;
	cout<<"il punteggio di "<<g2<<" e' "<<p2<<endl;
	
	if(p1>p2)
	{
		cout<<"il vincitore e' "<<g1<<" con "<<p1<<" punti"<<endl;
	}
	
	if(p2>p1)
	{
		cout<<"il vincitore e' "<<g2<<" con "<<p2<<" punti"<<endl;
	}
	
	if(p1==p2)
	{
		cout<<"pareggio"<<endl;
	}
}
