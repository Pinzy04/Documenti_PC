#include<iostream>
using namespace std;

int main()
{
	int num,cont,somma;
	
	cout<<"inserisci un numero"<<endl;
	cin>>num;
	
	if(num<=100)
	{
		cont=1;
		somma=num;
		
		do{
			cout<<"inserisci un numero"<<endl;
			cin>>num;
			somma=somma+num;
			cont++;
		}while(somma<=100);
		somma=somma-num;
		cont=cont-1;
		cout<<"la somma vale "<<somma<<", i numeri che hai inserito prima che la somma fosse maggiore o uguale a 100 sono "<<cont;
	}
	else
	{
		cout<<"hai inserito un numero maggiore di 100";
	}
}
