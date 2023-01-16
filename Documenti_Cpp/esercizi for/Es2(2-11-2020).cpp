#include<iostream>
using namespace std;

int main()
{
	int i,n,num,contp=0,contd=0;
	cout<<"Quanti numeri vuoi inserire?"<<endl;
	cin>>n;
	
	cout<<"inserisci i numeri"<<endl;
	for(i=0;i<n;i++)
	{
		cin>>num;
		if(num%2==0)
		{
			contp++;
		}
		else
		{
			contd++;
		}
	}
	cout<<"i numeri pari sono "<<contp<<" e i numeri dispari sono "<<contd<<endl;
	if(contp>contd)
	{
		cout<<"sono stati inseriti piu' numeri pari"<<endl;
	}
	if(contd>contp)
	{
		cout<<"sono stati inseriti piu' numeri dispari"<<endl;
	}
	if(contp==contd)
	{
		cout<<"i numeri sono stati inseriti in ugual numero";
	}
}
