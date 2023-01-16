#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;

int main(){
	srand(time(NULL));
	
	const int DIM=21;
	int numeri[DIM],i,N=10,cont=0;
	for(i=0;i<N;i++){
		numeri[i]=rand()%21-10;
		if(numeri[i]>0)
			cont++;
		else
			cout<<numeri[i]<<endl;
	}
	cout<<"i numeri positivi sono "<<cont<<endl;
}
