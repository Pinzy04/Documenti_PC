#include<iostream>
using namespace std;

int main()
{
	int i,num,min,cont=0;
	cout<<"inserire il numero ";
	cin>>num;
	min=num;
	if(num>0)
	{
		cont=1;
	}
	for(i=1;i<10;i++)
	{
		cout<<"inserire il numero ";
		cin>>num;
		if(num<min)
		{
			min=num;
		}
		if(num>0)
		{
			cont++;
		}
	}
	cout<<"il minimo e' "<<min<<" e i numeri positivi sono "<<cont;
}
