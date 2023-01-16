#include<iostream>
using namespace std;

int main()
{
	float voto,somma,cont=0,media;
	char next;
	
	cout<<"inserire il voto"<<endl;
	cin>>voto;
	
	if((voto>=2)&&(voto<=10))
	{
		cont++;
		somma=voto;
		
		do{
			cout<<"continuare? (si=s e no=n)"<<endl;
			cin>>next;
			if(next=='s')
			{
				cout<<"inserire il voto"<<endl;
				cin>>voto;
				if((voto>=2)&&(voto<=10))
				{
					cont++;
					somma=somma+voto;
				}
				else
				{
					cout<<"errore, il voto non e' compreso tra 2 e 10"<<endl;
				}
			}
		}while(next=='s');
	media=somma/cont;
	cout<<"la media e' "<<media<<endl;
	}
	else
	{
		cout<<"errore, il voto non e' compreso tra 2 e 10";
	}
	
}
