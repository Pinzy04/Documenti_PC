#include <iostream>
using namespace std;


int main() {
  int scelta;
  do{
  cout << "inserisci un numero fra 1 e 4"<<endl;
  cin>>scelta;
  switch(scelta){
    case 1: cout<<"hai premuto 1"<<endl;
            break;
    case 2: cout<<"hai premuto 2"<<endl;
            break;
    case 3: cout<<"hai premuto 3"<<endl;
            break;
    case 4: cout<<"esci"<<endl;
            break;
    default: cout<<"scelta non ammissibile"<<endl;
  }}while(scelta!=4);
}
