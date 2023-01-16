#include<iostream>
using namespace std;

int main()
{
	int i,n,num,prod=1,cont=0,somma=0;
	float media;
		
	cout<<"Quanti numeri vuoi inserire?"<<endl;
	cin>>n;
	
	cout<<"inserisci i numeri"<<endl;

	for(i=0;i<n;i++){
		cin>>num;
		if(num%2==0)
		{
			prod=prod*num;
			cont++;
			somma=somma+num;	
		}
	}
	if(cont!=0)
	{
		media=somma/cont;
		cout<<"il prodotto dei numeri pari vale "<<prod<<" e la media dei numeri pari e' "<<media;
	}
	else
	{
		cout<<"non sono stati inseriti numeri pari";
	}
}
