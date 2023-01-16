#include <iostream>
using namespace std;

	int lato,perimetro,area;
		
int pQuadrato(){
	perimetro=lato*4;
	return perimetro;
} 

int aQuadrato(){
	area=lato*lato;
	return area;
}


int pEsagono(){
	perimetro=lato*6;
	return perimetro;
}

int aEsagono(){
	area=((lato*6)*(lato*0.688))/2;
	return area;
}


int pOttagono(){
	perimetro=lato*8;
	return perimetro;
}

int aOttagono(){
	area=((lato*8)*(lato*1.207))/2;
	return area;
}

int main()
{
	cout<< "inserisci il lato: ";
	cin>>lato;
	
	cout<<"il perimetro del quadrato e': "<<pQuadrato()<<endl;
	cout<<"l'area del quadrato e': "<<aQuadrato()<<endl;
	
	cout<<"il perimetro del esagono e': "<<pEsagono()<<endl;
	cout<<"l'area del esagono e': "<<aEsagono()<<endl;
	
	cout<<"il perimetro del ottagono e': "<<pOttagono()<<endl;
	cout<<"l'area del ottagono e': "<<aOttagono()<<endl;
	
	return 0;
}

