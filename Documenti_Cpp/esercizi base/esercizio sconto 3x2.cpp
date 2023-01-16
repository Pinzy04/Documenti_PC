#include <iostream>
using namespace std;

int main()
{
	int np1,np2,np3;
	float p1,p2,p3,prezzo1,prezzo2,prezzo3,spesa;
	
	cout<<"inserire il prezzo del primo prodotto: "<<endl;
	cin>>p1;
	cout<<"inserire la quantita' del primo prodotto: "<<endl;
	cin>>np1;
	cout<<"inserire il prezzo del secondo prodotto: "<<endl;
	cin>>p2;
	cout<<"inserire la quantita' del secondo prodotto: "<<endl;
	cin>>np2;
	cout<<"inserire il prezzo del terzo prodotto: "<<endl;
	cin>>p3;
	cout<<"inserire la quantita' del terzo prodotto: "<<endl;
	cin>>np3;
	
	prezzo1=(np1/3*(p1*2))+(np1%3*(p1));
	prezzo2=(np2/3*(p2*2))+(np2%3*(p2));
	prezzo3=(np3/3*(p3*2))+(np3%3*(p3));
	spesa=prezzo1+prezzo2+prezzo3;
	
	cout<<"la spesa finale e' "<<spesa;
}
