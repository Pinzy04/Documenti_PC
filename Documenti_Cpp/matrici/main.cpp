#include <iostream>
using namespace std;
int main() {
  int mat[3][3]; //matrice quadrata 5x5=25 elementi
  int r,c,max,somma=0,cont=0;
  for(r=0;r<3;r++){
    for(c=0;c<3;c++){
      cin>>mat[r][c];
    }
  }
  for(r=0;r<3;r++){
    for(c=0;c<3;c++){
      cout<<mat[r][c]<<" ";
    }
    cout<<endl;
  }
  //il valore massimo della matrice
  max=mat[0][0];
  for(r=0;r<3;r++){
    for(c=0;c<3;c++){
      if(mat[r][c]>max)
                max=mat[r][c];
    }
   }
   cout<<"il massimo "<<max<<endl;

 for(r=0;r<3;r++){
    for(c=0;c<3;c++){
      if(mat[r][c]==max)
                cout<<r<<" "<<c<<" "<<endl;
    }
   }
 //quante volte si ripete il massimo
 for(r=0;r<3;r++){
    for(c=0;c<3;c++){
      if(mat[r][c]==max)
                cont++;
    }
   }
  cout<<"si ripete "<<cont<< "volte"<<endl;

  for(r=0;r<3;r++){
    for(c=0;c<3;c++){
         somma=somma+mat[r][c];
    }
   }
   cout<<"la somma totale "<<somma<<endl;
  for(r=0;r<3;r++){
    somma=0;
    for(c=0;c<3;c++){
         somma=somma+mat[r][c];
    }
    cout<<"la somma della riga "<<r<<"  "<<somma<<endl;
   }
}