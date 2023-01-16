#include<iostream>
using namespace std;

int main(){
	int numeri[10],i,N=10,somma=0,pos,min;
	for(i=0;i<N;i++){
		cout<<"inserire un numero"<<endl;
		cin>>numeri[i];
		
		if(numeri[i]%2==0)
			somma=somma+numeri[i];
		if(i==0)
			min=numeri[i];
	}
	
	for(i=0;i<N;i++){
		if(min>numeri[i]){
			min=numeri[i];
			if(min==numeri[i])
			pos=i;
		}
		
		if(i%2==1)
			cout<<"posizione["<<i<<"]"<<numeri[i]<<endl;
	}
	
	cout<<"la somma dei numeri pari e' "<<somma<<endl;
	cout<<"posizione 4: "<<numeri[3]<<endl;
	cout<<"posizione 5: "<<numeri[4]<<endl;
	cout<<"il minimo e' "<<min<<endl;
	cout<<"la posizione in cui si trova il minimo e' "<<pos<<endl;
}
