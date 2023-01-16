#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;

char tris[3][3] = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };
int r,c,postris=1;

void gioco(){
    system("cls");
	for(r=0;r<3;r++){
		for(c=0;c<3;c++)
		{
			cout<<tris[r][c]<<" ";
		}
		cout<<endl;
	}
}

void player(char simbolo){
    int pos;
    bool ok=false;
    do{
        do{
            cout<<"inserisci la posizione in cui vuoi mettere la "<<simbolo<<"(da 1 a 9)"<<endl;
            cin>>pos;
            if(pos<1 || pos>9){
                cout<<"Errore, riprova"<<endl;
            }
        }while(pos<1 || pos>9);

        for(r=0;r<3;r++){
            for(c=0;c<3;c++){
                if(tris[r][c]!='O' && tris[r][c]!='X'){
                    if(pos==postris){
                        tris[r][c]=simbolo;
                        ok=true;
                    }
                }
                else{
                    cout<<"impossiblie inserire la "<<simbolo<<" in questa casella"<<endl;
                }
                postris++;
            }
        }
        postris=1;
    }while(ok==false);
}

void com(char simbolo){
    srand(time(NULL));
    int pos;
    bool ok=false;
    do{
        pos=rand()%9+1;
        for(r=0;r<3;r++){
            for(c=0;c<3;c++){
                if(tris[r][c]!='O' && tris[r][c]!='X'){
                    if(pos==postris){
                        tris[r][c]=simbolo;
                        ok=true;
                    }
                }
                else{
                    cout<<"impossiblie inserire la "<<simbolo<<" in questa casella"<<endl;
                }
                postris++;
            }
        }
        postris=1;
    }while(ok==false);
}

int fine(){
    int vittoria=0;
    if (tris[0][0] == 'X' && tris[0][1] == 'X' && tris[0][2] == 'X')
		vittoria=1;
	if (tris[1][0] == 'X' && tris[1][1] == 'X' && tris[1][2] == 'X')
		vittoria=1;
	if (tris[2][0] == 'X' && tris[2][1] == 'X' && tris[2][2] == 'X')
		vittoria=1;
	if (tris[0][0] == 'X' && tris[1][0] == 'X' && tris[2][0] == 'X')
		vittoria=1;
	if (tris[0][1] == 'X' && tris[1][1] == 'X' && tris[2][1] == 'X')
		vittoria=1;
	if (tris[0][2] == 'X' && tris[1][2] == 'X' && tris[2][2] == 'X')
		vittoria=1;
	if (tris[0][0] == 'X' && tris[1][1] == 'X' && tris[2][2] == 'X')
		vittoria=1;
	if (tris[2][0] == 'X' && tris[1][1] == 'X' && tris[0][2] == 'X')
		vittoria=1;

	if (tris[0][0] == 'O' && tris[0][1] == 'O' && tris[0][2] == 'O')
		vittoria=2;
	if (tris[1][0] == 'O' && tris[1][1] == 'O' && tris[1][2] == 'O')
		vittoria=2;
	if (tris[2][0] == 'O' && tris[2][1] == 'O' && tris[2][2] == 'O')
		vittoria=2;
	if (tris[0][0] == 'O' && tris[1][0] == 'O' && tris[2][0] == 'O')
		vittoria=2;
	if (tris[0][1] == 'O' && tris[1][1] == 'O' && tris[2][1] == 'O')
		vittoria=2;
	if (tris[0][2] == 'O' && tris[1][2] == 'O' && tris[2][2] == 'O')
		vittoria=2;
	if (tris[0][0] == 'O' && tris[1][1] == 'O' && tris[2][2] == 'O')
		vittoria=2;
	if (tris[2][0] == 'O' && tris[1][1] == 'O' && tris[0][2] == 'O')
		vittoria=2;

    return vittoria;
}

int main(){
    int scelta;
    char x='X',o='O';
    do{
        cout<<"Per giocare contro il computer premere 1, per giocare 1vs1 premere 2 e per smettere premere 3."<<endl;
        cin>>scelta;
        switch(scelta){
            case 1: do{
                        gioco();
                        player(x);
                        com(o);
                    }while(fine()!=1 && fine()!=2);
                    gioco();
                    if(fine()==1)
                        cout<<"hai vinto"<<endl;
                    if(fine()==2)
                        cout<<"hai perso"<<endl;
                    break;
            case 2: do{
                        gioco();
                        player(x);
                        gioco();
                        if(fine()!=1 && fine()!=2)
                            player(o);
                    }while(fine()!=1 && fine()!=2);
                    gioco();
                    if(fine()==1)
                        cout<<"hai vinto"<<endl;
                    if(fine()==2)
                        cout<<"hai perso"<<endl;
                    break;
            case 3: cout<<"hai finito"<<endl;
                    break;
            default:cout<<"non hai scelto tra 1 o 2"<<endl;
        }
        tris[0][0]='1';
        tris[0][1]='2';
        tris[0][2]='3';
        tris[1][0]='4';
        tris[1][1]='5';
        tris[1][2]='6';
        tris[2][0]='7';
        tris[2][1]='8';
        tris[2][2]='9';
    }while(scelta!=3);
}
