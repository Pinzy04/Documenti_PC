#include <iostream>
#include <fstream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main()
{
	srand(time(NULL));
	
	int i,l;
	string nome;
	
	ofstream fout("file nomi con f.dat");
	for(i=0;i<10;i++)
	{
		cin>>nome;
		fout<<nome<<endl;
	}
	fout.close();
	cout<<endl<<"nomi: "<<endl;
	ifstream f1in("file nomi con f.dat");
	while(f1in>>nome)
	{
		cout<<nome<<endl;
	}
	f1in.close();
	cout<<endl<<"nomi con f: "<<endl;
	ifstream f2in("file nomi con f.dat");
	while(f2in>>nome)
	{
		l=nome.length();
		for(i=0;i<l;i++)
		{
			if(nome[i]=='f')
			{
				i=l;
				cout<<nome<<endl;
			}
		}
	}
	f2in.close();
}

