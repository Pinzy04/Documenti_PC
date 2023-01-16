#include <iostream>
using namespace std;

int main()
{
	int num,cont=0;
	do{
		cout<<"inserisci un numero"<<endl;
		cin>>num;
		cont++;
	}while(num!=0);
	cont=cont-1;
	cout<<"hai inserito 0"<<endl;
	cout<<"i numeri che hai inserito sono "<<cont;
}

