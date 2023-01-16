#include<iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main(){
	srand(time(NULL));
	
	int risultati[10],i,d1,d2;
	for(i=0;i<10;i++){
		d1=rand()%6+1;
		d2=rand()%6+1;
		if((d1>d2)||(d1==d2))
			risultati[i]=d1;
		else
			risultati[i]=d2;
	}
	for(i=0;i<10;i++){
		cout<<risultati[i]<<endl;
	}
}
