#include<iostream>
#include<string>
using namespace std;
void massimo(float mat[5][5],float vet[5]){
    int r,c,max;
    for(r=0;r<5;r++){
        max=mat[r][0];
        for(c=0;c<5;c++){
            if(max<mat[r][c])
                max=mat[r][c];
        }
        vet[r]=max;
    }
}

int main(){
    int r,c,i,k=-1,max;
    string citta[5],parola;
    float mat[5][5],somma[5]={0,0,0,0,0},media[5]={0,0,0,0,0},vet[5]={0,0,0,0,0};
    for(i=0;i<5;i++){
        cin>>citta[i];
    }
    for(r=0;r<5;r++){
        for(c=0;c<5;c++){
            cin>>mat[r][c];
        }
    }
    for(r=0;r<5;r++){
        for(c=0;c<5;c++){
            somma[r]=somma[r]+mat[r][c];
        }
    }
    for(i=0;i<5;i++){
        media[i]=somma[i]/5;
    }
    massimo(mat,vet);

    for(i=0;i<5;i++){
        cout<<citta[i]<<vet[i]<<endl;
    }
    cout<<"inserisci la citta' di cui vuoi sapere la temperatura massima"<<endl;
    for(i=0;i<5;i++){
        if(parola==citta[i])
            k=i;
    }
}
