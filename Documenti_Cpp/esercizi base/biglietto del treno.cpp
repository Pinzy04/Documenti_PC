#include<iostream>
using namespace std;

int main()
{
	float km,tariffa,costo;
	
	char classe;
	
	cout<<"inserire i km da percorrere"<<endl;
	cin>>km;
	
	tariffa=0.26;
	costo=km*tariffa;
	
	cout<<"inserire la classe"<<endl;
	cin>>classe;
	
	if(classe=='a')
	{
		costo=costo+10;
		cout<<"il costo e' "<<costo;
	}
	if(classe=='b')
	{
		costo=costo+20;
		cout<<"il costo e' "<<costo;
	}
	if(classe=='c')
	{
		costo=costo+30;
		cout<<"il costo e' "<<costo;
	}
	if(classe!='a' && classe!='b' && classe!='c')
	{
		cout<<"classe inesistente, impossibile calcolare il costo"<<endl;
	}
}
