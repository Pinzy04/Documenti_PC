#include<iostream>
using namespace std;

int main()
{
	int n1,n2,somma;
	do{
		cout<<"inserisci due numeri positivi"<<endl;
		cin>>n1;
		cin>>n2;
	}while((n1<=0)||(n2<=0));
	somma=n1+n2;
	cout<<"la somma dei due numeri positivi e' "<<somma;
}
