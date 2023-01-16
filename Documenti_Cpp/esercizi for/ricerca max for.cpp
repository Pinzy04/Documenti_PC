#include<iostream>
using namespace std;

int main()
{
	int i,num,max;
	
	cout<<"inserisci il numero ";
	cin>>num;
	max=num;
	for(i=1;i<10;i++)
	{
		cout<<"inserisci il numero ";
		cin>>num;
		if(num>max)
		{
			max=num;
		}
	}
	cout<<"il massimo e' "<<max;
}
