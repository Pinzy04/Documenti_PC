#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main(){
	srand(time(NULL));
	
	int d1,d2,ris,cella=1,cont=0;
	
	do{	
		d1=rand()%6 + 1;
		d2=rand()%6 + 1;
		cont++;
		ris=d1+d2;
		
		if(ris==12){
			ris=15;
		}
		cout<<"la somma dei dadi e' "<<ris<<endl;
		
		if((cella==1)&&(ris==9)){
			cout<<"hai fatto 9 partendo dalla prima casella"<<endl;
			cella=90;
		}	
		cella=cella+ris;
		
		if(ris==2){
			cella=1;
		}
		
		if(cella>99){
			cella=99-(cella-99);
		}
		cout<<"sei alla casella "<<cella<<endl;
	}while(cella<99);
	cout<<"hai vinto!"<<endl;
	cout<<"hai fatto "<<cont<<" lanci";
}
