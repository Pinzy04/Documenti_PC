#include <iostream>
using namespace std;

	int num1,num2,somma,diff;//variabili globali
		
int RisolviSomma() //non ci sono parametri
{
	somma = num1+num2;
	return somma;
} 

int RisolviSottrazione(){
	diff=num1-num2;
	return diff;
}

int main()
{
	cout << "dimmi due numeri: ";
	cin >> num1 >> num2 ;
	cout<<"la somma vale "<<RisolviSomma()<<endl;
	cout<<"la sottrazione vale "<<RisolviSottrazione();
	
	return 0;
}

