#include<iostream>
using namespace std;

int main()
{
	int iva;
	float prezzo;
	const float iva1=1.04;
	const float iva2=1.10;
	const float iva3=1.22;
	
	cout<<"inserire il prezzo"<<endl;
	cin>>prezzo;
	cout<<"quanto vale l'iva? (1=4%, 2=10%, 3=20%)"<<endl;
	cin>>iva;
	
	if(iva>0 && iva<4)
	{
		if(iva==1)
		{
			prezzo=prezzo*iva1;
		}
		else
		{
			if(iva==2)
			{
				prezzo=prezzo*iva2;
			}
			else
			{
				if(iva==3)
				{
					prezzo=prezzo*iva3;
				}
			}
		}
		cout<<"il prezzo+iva e' "<<prezzo;
	}
	else
	{
		cout<<"non hai inserito un numero compreso tra 1 e 3";
	}
}
