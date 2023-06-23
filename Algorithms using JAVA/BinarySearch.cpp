#include <iostream>
using namespace std;

void selectionSort(int a[], int n)
{
    int i, j, m, temp;
    for (i = 0; i < n - 1; i++)
    {
        m = i;
        for (j = i + 1; j < n; j++)
        {
            if (a[j] < a[m])
            {
                m = j;
            }
        }
        temp = a[i];
        a[i] = a[m];
        a[m] = temp;
    }
}

int Binary(int arr[], int size,int min, int max, int val)
{

    while (min <= max)
    {
        int mid = min + (max-min) / 2;

        if (arr[mid] == val)
        {
            return mid;
        }
        else if (arr[mid] < val)
        {
            min = mid + 1;
        }
        else if (arr[mid] > val)
        {
            max = mid - 1;
        }
    }
    return -1;
}

int main()
{
    int i, size, val;
    cout << "Enter the size of the Array: " << endl;
    cin >> size;
    int arr[size];

    cout << "Enter the elements of the Array:" << endl;
    for (i = 0; i < size; i++)
    {
        cin >> arr[i];
    }

    cout << "Enter the element to search in the array: " << endl;
    cin >> val;

    cout << "Sorting the Entered Array... " << endl;
    selectionSort(arr, size);

    cout << "Array Sorted." << endl;
    cout << "Finding the entered Element..." << endl;

    int result = Binary(arr, size,0,size-1, val);

    if (result == -1)
    {
        cout << "The element is not found in the Array." << endl;
    }

    else
    {
        cout << "The element was found at the index: " << result << endl;
    }

    return 0;
}