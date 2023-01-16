#include<iostream>
using namespace std;

int main(){
	int persone=0,scelta;
	
	do{
		cout << "Gestire in un negozio: premendo 1 entra una persona, premendo 2 esce, premendo 3 vizualizza quante prsone ci sono nel"<<endl<<"negozio(la capienza massima e' 5) e premendo 4 finisce tutto."<<endl;
		cin>>scelta;
		switch(scelta){
    		case 1: cout<<"Sta entrando una persona."<<endl<<endl;
    				if(persone<5)
						persone++;
					else
					cout<<"Il negozio e' pieno, attendere che una persona esca."<<endl<<endl;
            	break;
			case 2: cout<<"Sta uscendo una persona"<<endl<<endl;
					if(persone>0)
						persone--;
					else
					cout<<"Il negozio e' vuoto, attendere che una persona entri."<<endl<<endl;
        		break;
   			 case 3: cout<<"Le persone nel negozio sono: "<<persone<<endl<<endl;
            	break;
    		case 4: cout<<"La gestione del negozio e' finita, grazie e arrivederci "<<endl<<endl;
            	break;
    		default: cout<<"Scelta non ammissibile"<<endl<<endl;
		}
	}while(scelta!=4);
}
