#include <iostream>
using namespace std;

void insertionsort(int arr[], int size)
{
    int i, j, key;
    for (i = 1; i < size; i++)
    {
        key = arr[i]; //take value
        j = i;
    
        while (j > 0 && arr[j - 1] > key)
        {
            arr[j] = arr[j - 1];
            j--;
        }
        arr[j] = key; //insert in right place
    }
}


int main()
{
    int size, i;

    cout << "enter size of an array : ";
    cin >> size;
    int arr[size];

    cout << "Give all elements for array" << endl;
    for (i = 0; i < size; i++)
    {
        cin >> arr[i];
    }

    cout << "Displaying before sorting the array:" << endl;
    for (i = 0; i < size; i++)
    {

        cout << arr[i] << " ";
    }
    cout << endl;

    insertionsort(arr, size);

    cout << "Displaying after sorting the array:" << endl;
    for (i = 0; i < size; i++)
    {

        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}