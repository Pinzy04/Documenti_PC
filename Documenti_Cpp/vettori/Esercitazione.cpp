#include<iostream>
using namespace std;

int main(){
	int numeri[10],i,N=10,somma=0,pos,max;
	for(i=0;i<N;i++){
		cout<<"inserire un numero"<<endl;
		cin>>numeri[i];
		
		if(numeri[i]%2==1)
			somma=somma+numeri[i];
		if(i==0)
			max=numeri[i];
	}
	
	for(i=0;i<N;i++){
		if(max<numeri[i]){
			max=numeri[i];
			if(max==numeri[i])
			pos=i;
		}
		
		if((i%2==0)&&(numeri[i]%2==0))
			cout<<"posizione["<<i<<"]"<<numeri[i]<<endl;
	}
	
	cout<<"la somma dei numeri dispari e' "<<somma<<endl;
	cout<<"posizione 9: "<<numeri[8]<<endl;
	cout<<"il massimo e' "<<max<<endl;
	cout<<"la posizione in cui si trova il massimo e' "<<pos<<endl;
}
