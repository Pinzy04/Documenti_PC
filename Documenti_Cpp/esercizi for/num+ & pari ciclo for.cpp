#include <iostream>
using namespace std;

int main()
{
	int N,i,num,cont;
	
	for(i=0;i<N;i++)
	{
		cout<<"inserire il numero"<<endl;
		cin>>num;
		
		if((num>0)&&(num%2==0))
		{
			cont++;
		}
	}
	cout<<"hai inserito "<<cont<<" numeri positivi e pari"<<endl;
}
