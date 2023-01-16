#include<iostream>
using namespace std;
int main()
{
	int N,i,num,cont=0;
	
	cout<<"quanti numeri vuoi inserire?";
	cin>>N;
	for(i=0;i<N;i++)
	{
		cout<<"inserisci il numero";
		cin>>num;
		if(num>0)
		{
			cont++;
		}
	}
	cout<<"hai inserito "<<cont<<" numeri positivi";
}
