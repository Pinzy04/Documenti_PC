#include <iostream>
#include <fstream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main()
{
	srand(time(NULL));
	
	int i,numero,positivi=0;
	
	ofstream fout("file numeri casuali.dat");
	for(i=0;i<20;i++)
	{
		numero=rand()%41-20;
		fout<<numero<<endl;
	}
	fout.close();
	
	ifstream fin("file numeri casuali.dat");
	while(fin>>numero)
	{
		if(numero>0)
			positivi++;
	}
	cout<<"i numeri positivi sono "<<positivi<<endl;
	fin.close();
}



