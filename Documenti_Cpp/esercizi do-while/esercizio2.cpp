#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;
int main(){
	srand(time(NULL));

	int num,cont2=0,cont6=0,cont9=0;

	do{
	num=rand()%8+2;
		if(num==2 || num==6 || num==9)
		{
			cout<<num<<endl;
		}
		if(num==2)
		{
			cont2++;
		}
		if(num==6)
		{
			cont6++;
		}
		if(num==9)
		{
			cont9++;
		}
	
	}while(cont2!=5 && cont6!=5 && cont9!=5);
	
	if(cont2==5 && cont6>cont9){
		cout<<"Il numero 2 e' uscito "<<cont2<<" volte"<<endl;
		cout<<"Il numero 6 e' uscito "<<cont6<<" volte"<<endl;
		cout<<"Il numero 9 e' uscito "<<cont9<<" volte"<<endl;
	}
	
	if(cont2==5 && cont6<cont9){
		cout<<"Il numero 2 e' uscito "<<cont2<<" volte"<<endl;
		cout<<"Il numero 9 e' uscito "<<cont9<<" volte"<<endl;
		cout<<"Il numero 6 e' uscito "<<cont6<<" volte"<<endl;
	}
	
	if(cont6==5 && cont2>cont9){
		cout<<"Il numero 6 e' uscito "<<cont6<<" volte"<<endl;
		cout<<"Il numero 2 e' uscito "<<cont2<<" volte"<<endl;
		cout<<"Il numero 9 e' uscito "<<cont9<<" volte"<<endl;
	}
	
	if(cont6==5 && cont2<cont9){
		cout<<"Il numero 6 e' uscito "<<cont6<<" volte"<<endl;
		cout<<"Il numero 9 e' uscito "<<cont9<<" volte"<<endl;
		cout<<"Il numero 2 e' uscito "<<cont2<<" volte"<<endl;
	}
	
	if(cont9==5 && cont2>cont6){
		cout<<"Il numero 9 e' uscito "<<cont9<<" volte"<<endl;
		cout<<"Il numero 2 e' uscito "<<cont2<<" volte"<<endl;
		cout<<"Il numero 6 e' uscito "<<cont6<<" volte"<<endl;
	}
	
	if(cont9==5 && cont2<cont6){
		cout<<"Il numero 9 e' uscito "<<cont9<<" volte"<<endl;
		cout<<"Il numero 6 e' uscito "<<cont6<<" volte"<<endl;
		cout<<"Il numero 2 e' uscito "<<cont2<<" volte"<<endl;
	}
	
	if(cont9==5 && cont2==cont6){
		cout<<"Il numero 9 e' uscito "<<cont9<<" volte"<<endl;
		cout<<"Il numero 6 e il numero 2 sono usciti "<<cont6<<" volte"<<endl;
	}
	
	if(cont6==5 && cont2==cont9){
		cout<<"Il numero 6 e' uscito "<<cont9<<" volte"<<endl;
		cout<<"Il numero 9 e il numero 2 sono usciti "<<cont6<<" volte"<<endl;
	}
	
	if(cont2==5 && cont9==cont6){
		cout<<"Il numero 2 e' uscito "<<cont9<<" volte"<<endl;
		cout<<"Il numero 6 e il numero 9 sono usciti "<<cont6<<" volte"<<endl;
	}
}
