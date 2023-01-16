#include<iostream>
#include<cstdlib>
#include<ctime>
using namespace std;
int main(){

    srand(time(NULL));

    int mat[3][3]; //matrice quadrata 5x5=25 elementi
    int r,c,max,media=0,contn=0,contp=0,vet[4]={0,0,0,0};

    for(r=0;r<4;r++){
        for(c=0;c<4;c++){
            mat[r][c]=rand()%21-10;
            cout<<mat[r][c]<<" ";
            if(mat[r][c]<0){
                contn++;
            }
        }
        cout<<endl;
    }
    cout<<"i numeri negativi sono "<<contn<<endl;

    for(r=0;r<4;r++){
        for(c=0;c<4;c++){
            if(mat[r][c]>0){
                contp++;
                media=media+mat[r][c];
                vet[r]++;
            }
        }
    }
    if(contp==0){
        cout<<"non ci sono numeri positivi percio' non si puo' fare la media"<<endl;
    }
    else{
        media=media/contp;
        cout<<"la media e' "<<media<<endl;
    }
    max=vet[1];
    for(r=0;r<4;r++){
        cout<<"nella riga "<<r<<" ci sono "<<vet[r]<<" positivi"<<endl;
        if(vet[r]>max){
            max=vet[r];
        }
    }
    for(r=0;r<4;r++){
        if(vet[r]=max){
            cout<<"la riga con piu' positivi e' la riga "<<r<<endl;
        }
    }
}
