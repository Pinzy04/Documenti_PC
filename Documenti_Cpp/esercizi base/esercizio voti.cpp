#include<iostream>
using namespace std;

int main()
{
	float v1,v2,v3,media;
	
	cout<<"inserire il primo voto "<<endl;
	cin>>v1;
	cout<<"inserire il secondo voto "<<endl;
	cin>>v2;
	cout<<"inserire il terzo voto "<<endl;
	cin>>v3;
	
	if(((v1<=0) || (v1>10)) || ((v2<=0) || (v2>10)) || ((v3<=0) || (v3>10)))
	{
		cout<<"errore, un voto non e' compreso tra 1 e 10";
	}
	else
	{
		media=(v1+v2+v3)/3;
		
		if(media<4.5)
		{
			cout<<"la media e' "<<media<<" ed e' gravemente insufficiente"<<endl;
		}
		if((media>=4.5) && (media<6.0))
		{
			cout<<"la media e' "<<media<<" ed e' insuficiente"<<endl;
		}
		if((media>=6.0) && (media<7.5))
		{
			cout<<"la media e' "<<media<<" ed e' sufficiente"<<endl;
		}
		if(media>=7.5)
		{
			cout<<"la media e' "<<media<<" ed e' buona"<<endl;
		}
	}
}
