#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
	int v1,v2,v3,media,max;
	
	cout<<"inserire il primo voto"<<endl;
	cin>>v1;
	
	cout<<"inserire il secondo"<<endl;
	cin>>v2;
	
	cout<<"inserire il terzo voto"<<endl;
	cin>>v3;
	
	media=(v1+v2+v3)/3;
	cout<<"la media e' "<<media<<endl;
	
	max=v1;
	
	if(v2>max)
	{
		max=v2;
	}
	
	if(v3>max)
	{
		max=v3;
	}
	
	cout<<"il voto piu' alto e' "<<max;
}
