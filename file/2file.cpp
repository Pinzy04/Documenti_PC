#include <iostream>
#include <cstdlib>
#include <ctime>
#include <fstream>
#include <string>

using namespace std;

const int dim=40;

void ordinamento(int n, int vet[])
{
    int i, j, app;

    for(i=0;i<n-1;i++)
    {
		for(j=i+1;j<n;j++)
		{
			if(vet[i]>vet[j])
			{
				app=vet[i];
				vet[i]=vet[j];
				vet[j]=app;
			}
		}
	}
}

void ripetuti(int n, int vet[])
{
    int i, j, r=0;
    bool f; // f serve a trovare i numeri che si ripetono piu' volte

    i=0;
    while(i<n)
    {
        f=false;
        if(vet[i]==vet[i+1])
        {
            j=0;
            while(f==false)
            {
                if(vet[i]==vet[i+j])
                {
                    j++;
                }
                else
                {
                    f=true;
                }
            }
            r++;
        }
        i++;
    }
    cout<<"I numeri che si ripetono sono "<<r<<endl;
}

int main()
{
    int i, j, pos=0, pari=0, tot, num, vet[dim];

    srand(time(NULL));

    ofstream f1out("pos.dat");
    ofstream f2out("pari.dat");

    for(i=0; i<dim; i++)
    {
        num=rand()%201-100;

        if(num>0)
        {
            f1out<<num<<endl;
        }

        if(num%2==0)
        {
            f2out<<num<<endl;
        }
    }

    f1out.close();
    f2out.close();

    ifstream f1in("pos.dat");

    while(f1in>>num)
    {
            pos++;
            vet[pos]=num;
    }
    ordinamento(pos,vet);
    cout<<"I numeri positivi sono "<<pos<<endl;
    ripetuti(pos, vet);
    f1in.close();

    ofstream f3out("pos.dat");
    for(i=0;i<pos;i++)
    {
        f3out<<vet[i]<<endl;
    }
    f3out.close();

    ifstream f2in("pari.dat");

    while(f2in>>num)
    {
        pari++;
        vet[pari]=num;
    }
    ordinamento(pari,vet);
    cout<<"I numeri pari sono "<<pari<<endl;
    ripetuti(pari, vet);
    f2in.close();

    ofstream f4out("pari.dat");
    for(i=0;i<pari;i++)
    {
        f4out<<vet[i]<<endl;
    }
    f4out.close();

    tot=pos+pari;

    cout<<"I numeri totali sono "<<tot<<endl;
}
