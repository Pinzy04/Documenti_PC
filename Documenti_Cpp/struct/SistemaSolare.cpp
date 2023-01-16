#include<iostream>
#include<string>
using namespace std;

struct SistemaSolare
{
    string nome;
    int diametro;
    int lune;
    int distanza;
};
int main()
{
    const int dim=8;
    int i,max,luna,min,equatore,distanza;
    SistemaSolare pianeti[dim];

    pianeti[0].nome="Mercurio";
    pianeti[0].diametro=4879;
    pianeti[0].lune=0;
    pianeti[0].distanza=57910000;

    pianeti[1].nome="Venere";
    pianeti[1].diametro=12104;
    pianeti[1].lune=0;
    pianeti[1].distanza=108200000;

    pianeti[2].nome="Terra";
    pianeti[2].diametro=12756;
    pianeti[2].lune=1;
    pianeti[2].distanza=149600000;

    pianeti[3].nome="Marte";
    pianeti[3].diametro=6804;
    pianeti[3].lune=0;
    pianeti[3].distanza=228000000;

    pianeti[4].nome="Giove";
    pianeti[4].diametro=142985 ;
    pianeti[4].lune=79;
    pianeti[4].distanza=780000000 ;

    pianeti[5].nome="Saturno";
    pianeti[5].diametro=120536 ;
    pianeti[5].lune=82;
    pianeti[5].distanza=429000000 ;

    pianeti[6].nome="Urano";
    pianeti[6].diametro=51118 ;
    pianeti[6].lune=27;
    pianeti[6].distanza=2800000000 ;

    pianeti[7].nome="Nettuno";
    pianeti[7].diametro=49528;
    pianeti[7].lune=14;
    pianeti[7].distanza=4475600000 ;

    cout<<"Nomi dei pianeti:"<<endl;

    for(i=0;i<8;i++)
    {
        cout<<pianeti[i].nome<<endl;
    }

    max=pianeti[0].lune;
    luna=0;
    for(i=1;i<8;i++)
    {
        if(pianeti[i].lune>max)
        {
            max=pianeti[i].lune;
            luna=i;
        }
    }
    for(i=0;i<8;i++)
    {
        if(i==luna)
            cout<<endl<<"Il pianeti con piu' lune e' "<<pianeti[luna].nome<<" con "<<pianeti[luna].lune<<" lune"<<endl;
    }

    min=pianeti[0].diametro;
    equatore=0;
    for(i=1;i<8;i++)
    {
        if(pianeti[i].diametro<min)
        {
            min=pianeti[i].diametro;
            equatore=i;
        }
    }
    for(i=0;i<8;i++)
    {
        if(i==equatore)
            cout<<endl<<"Il pianeti con il diametro equatoriale piu' piccolo e' "<<pianeti[equatore].nome<<" che misura "<<pianeti[equatore].diametro<<" km"<<endl<<endl;
    }

    cout<<"La distanza tra la Terra e "<<pianeti[0].nome<<" e' "<<pianeti[2].distanza-pianeti[0].distanza<<"km"<<endl;
    cout<<"La distanza tra la Terra e "<<pianeti[1].nome<<" e' "<<pianeti[2].distanza-pianeti[1].distanza<<"km"<<endl;
    cout<<"La distanza tra la Terra e "<<pianeti[3].nome<<" e' "<<pianeti[3].distanza-pianeti[2].distanza<<"km"<<endl;
    cout<<"La distanza tra la Terra e "<<pianeti[4].nome<<" e' "<<pianeti[4].distanza-pianeti[2].distanza<<"km"<<endl;
    cout<<"La distanza tra la Terra e "<<pianeti[5].nome<<" e' "<<pianeti[5].distanza-pianeti[2].distanza<<"km"<<endl;
    cout<<"La distanza tra la Terra e "<<pianeti[6].nome<<" e' "<<pianeti[2].distanza-pianeti[6].distanza<<"km"<<endl;
    cout<<"La distanza tra la Terra e "<<pianeti[7].nome<<" e' "<<pianeti[7].distanza-pianeti[2].distanza<<"km"<<endl;
}
