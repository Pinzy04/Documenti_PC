#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main() {
	srand(time(NULL));
	
	int num,cont=0,contn=0,contp=0,cont10=0,somma=0;
	float media;
	
	do{
		num=rand()%21 - 10;
		cout<<num<<endl;
		cont++;
		somma=somma+num;
		if(num<0)
		{
			contn++;
		}
		
		if(num%2==0)
		{
			contp++;
		}
		
		if(num==10)
		{
			cont10++;
		}
	}while(num!=0);
	
	media=somma/cont;
	cout<<"sono stati estratti "<<contn<<" numeri negativi"<<endl;
	cout<<"sono stati estratti "<<contp<<" numeri pari"<<endl;
	cout<<"e' stato estratto il numero 10 "<<cont10<<" volte"<<endl;
	cout<<"la media di tutti i numeri e' "<<media<<endl;
}
