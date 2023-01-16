#include<iostream>
using namespace std;

int main(){
	int i=0,num,cont=0,contp=0;
	float somma=0,media;
	
	while(i<10){
		cout<<"inserire il numero"<<endl;
		cin>>num;
				
		if(num>0){
			somma=somma+num;
			cont++;
		}
		if(num%2==0){
		contp++;
		}
		
		i++;
	}
	
	media=somma/cont;
	cout<<"la media dei numeri positivi e' "<<media<<endl;
	cout<<"i numeri pari sono "<<contp<<endl;
}
