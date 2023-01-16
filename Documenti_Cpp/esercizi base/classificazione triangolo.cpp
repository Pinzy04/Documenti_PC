#include <iostream>
using namespace std;

int main()
{
	float a,b,c;
	
	cout<<"inserire il primo lato del triangolo"<<endl;
	cin>>a;
	cout<<"inserire il secondo lato del triangolo"<<endl;
	cin>>b;
	cout<<"inserire il terzo lato del triangolo"<<endl;
	cin>>c;
	
	if(a==b && b==c)
	{
		cout<<"il triangolo e' equilatero"<<endl;
	}
	if((a==b && a!=c) || (a==c && a!=b) || (b==c && b!=a))
	{
		cout<<"il triangolo e' isoscele"<<endl;
	}
	if(a!=b && b!=c && a!=c)
	{
		cout<<"il triangolo e' scaleno"<<endl;
	}
}
