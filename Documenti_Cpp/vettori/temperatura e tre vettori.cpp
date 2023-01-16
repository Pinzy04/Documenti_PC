// Matees,Pinzarrone,Rignanese,Zangrandi,Tinaglia,Doria

#include <iostream>
using namespace std;
int main() 
{
	const int DIM=10;
	int max,min,N,cont,i;
	float media,numeri[DIM],temp[DIM];
	
	cout<<"Inserire 10 temperature"<<endl<<endl;
	
	N=DIM;
 
 	media=0;
 	cont=0;
	
	for(i=0;i<N;i++)
 	{
 
 	cout<<"Temperatura "<<i<<endl;
 	cin>>numeri[i];
 		
 		media=media+numeri[i];
	
		if(max<numeri[i])
		{
		max=numeri[i];
		}
		if(min>numeri[i])
		{
		min=numeri[i];	
		}
	}
		
	
	media=media/N;
	cout<<"La media delle temperature e' "<<media<<endl;
	for(i=0;i<N;i++)
	{
	if(numeri[i]<0)
	{
		cout<<"Temperature negativa "<<numeri[i]<<endl;
		cont++;
	}
	}
	j=0;
	for(i=0;i<N;i++)
	{
		if(numeri[i]>media)
	{
		temp[j]=numeri[i];
		j++;
		cout<<"Questo valore supera la media "<<temp[i]<<endl;
	}
		
		
	}
	
	for(i=0;i<N;i++)
	{
	
	if(max==numeri[i])
			{
			cout<<"La temperatura massima e' "<<max<<" e si trova nella posizione "<<i<<endl;;
			}
		
		if(min==numeri[i])
			{
			cout<<"La temperatura minima e' "<<min<<" e si trova nella posizione "<<i<<endl;;
			}
	}
	
	cout<<"Le temperature negative sono: "<<cont<<endl;
	
}
