#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
	int alt1,alt2,alt3,alt4,alt5,min,max;
	
	cout<<"Date le altezze degli studenti in centimetri verrano visualizzate la massima e la minima."<<endl;
	
	cout<<"Inserire l'altezza del primo studente: ";
	cin>>alt1;
	
	cout<<"Inserire l'altezza del secondo studente: ";
	cin>>alt2;
	
	cout<<"Inserire l'altezza del terzo studente: ";
	cin>>alt3;
	
	cout<<"Inserire l'altezza del quarto studente: ";
	cin>>alt4;
	
	cout<<"Inserire l'altezza del quinto studente: ";
	cin>>alt5;
	
	min=alt1;
	max=alt1;
	
	if(alt2>max)
	{
		max=alt2;
	}
	else
	{
		if(alt2<min)
		{
			min=alt2;
		}
	}
	
	
	if(alt3>max)
	{
		max=alt3;
	}
	else
	{
		if(alt3<min)
		{
			min=alt3;
		}
	}
	
	
	if(alt4>max)
	{
		max=alt4;
	}
	else
	{
		if(alt4<min)
		{
			min=alt4;
		}
	}
	
	
	if(alt5>max)
	{
		max=alt5;
	}
	else
	{
		if(alt5<min)
		{
			min=alt5;
		}
	}
	
	cout<<"L'altezza minima in centimetri e' "<<min<<endl;
	cout<<"Laltezza massima in centimetri e' "<<max<<endl;
}
