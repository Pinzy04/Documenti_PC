#include<iostream>
using namespace std;

int main()
{
	int N,i,somma=0,num;
	cout<<"quanti numeri?";
	cin>>N;
	for(i=0;i<N;i++)
	{
		cout<<"numero?";
		cin>>num;
		somma=somma+num;
	}
	cout<<"la somma vale "<<somma;
}
