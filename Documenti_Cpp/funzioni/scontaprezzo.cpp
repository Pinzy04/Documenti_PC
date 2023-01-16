#include<iostream>
using namespace std;

float scontaprezzo(float a, float b){
	b=a*(b/100);
	return a-b;
}

int main(){
	float prezzo,sconto;
	cout<<"Es 1"<<endl<<"inserire il prezzo: ";
	cin>>prezzo;
	cout<<"inserire la percentuale di sconto: ";
	cin>>sconto;
	cout<<"il prezzo scontato e': "<<scontaprezzo(prezzo,sconto)<<endl<<endl;
}
