#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;

int main(){
    srand(time(NULL));
	int i,j,n=10,v[10],cont=0,app;

	cout<<"inserire i numeri nel vettore"<<endl;

	for(i=0;i<n;i++){
		v[i]=rand()%15+1;
		cout<<v[i]<<endl;
	}

	for(i=0;i<n-1;i++){
		for(j=i+1;j<n;j++){
			if(v[i]>v[j]){
				app=v[i];
				v[i]=v[j];
				v[j]=app;
			}
		}
	}

	cout<<"il vettore ordinato e':"<<endl;
	for(i=0;i<n;i++){
		cout<<v[i]<<endl;
			if(v[i]>0)
			cont++;
	}

	cout<<"i tre elementi piu' piccoli sono:"<<endl;
	cout<<v[0]<<endl;
	cout<<v[1]<<endl;
	cout<<v[2]<<endl;
	cout<<"i numeri positivi sono "<<cont<<endl;
}
