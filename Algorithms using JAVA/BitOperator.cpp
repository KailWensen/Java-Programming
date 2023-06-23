#include <iostream>
using namespace std;

int main() {

	int a;
    int b;
    cout<<"Enter two Numbers: "<<endl;
    cin>>a>>b;

	cout<<"a = " << a <<","<< " b = " << b <<endl;
	cout << "a & b = " << (a & b) << endl;
	cout << "a | b = " << (a | b) << endl;
	cout << "a ^ b = " << (a ^ b) << endl;
	cout << "~a = " << (~a) << endl;
	cout<<"b << 1" <<" = "<< (b << 1) <<endl;
	cout<<"b >> 1 "<<"= " << (b >> 1 )<<endl;

	return 0;
}
