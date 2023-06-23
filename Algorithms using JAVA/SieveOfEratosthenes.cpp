#include<iostream>
using namespace std;

int main()
{
    int n1;
    cout<<"Enter the upper limit: "<<endl;
    cin>>n1;
	bool arr[n1];
	bool flag;
	for(int i=0;i<n1;i++)
		arr[i] = true;
	
		
	cout << "\n Prime Numbers from 1 to N are : \n";
		
	
	for(int i=2;i<n1;i++)
	{
		for(int j=i*i;j<n1;j+=i)
		{
			arr[j-1] = false;
		}
	}
	
	for(int i=2;i<n1;i++)
	{
		if(arr[i-1] == true)
			cout << "  " << i << "  ";
	}
	
	cout<<"\n";
	return 0;
}