#include <iostream>
using namespace std;

int main()
{
	float nlati,lato,area,perimetro;
	
	cout<<"inserire il numero dei lati ";
	cin>>nlati;
	
	if(nlati>6 || nlati<3)
	{
		cout<<"Errore, perimetro e area non calcolabili"<<endl;
	}
	else
	{
		cout<<"inserire la lunghezza del lato ";
		cin>>lato;
		
	}
	perimetro=nlati*lato;
	area=(perimetro*(lato/2))/2;
	
	cout<<"il perimetro vale "<<perimetro<<endl;
	cout<<"l'area vale "<<area<<endl;
}
