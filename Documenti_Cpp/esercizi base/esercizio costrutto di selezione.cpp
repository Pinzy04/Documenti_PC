#include <iostream>
using namespace std;

int main()
{
	float km,q,cf,ekm,eq,cost;		
	//cf= costo fisso, q= quintali, ekm= euro la chilometro, eq= euro al quintale, cost=costo finale
	
	cf=52;
	ekm=0.62;
	eq=0.08;
	
	cout<<"inserire i chilometri percorsi"<<endl;
	cin>>km;
	
	cout<<"inserire il peso del mezzo"<<endl;
	cin>>q;
	
	cost=cf+(km*ekm)+(q*eq);
	
	cout<<"il costo finale in euro e' "<<cost;
}
