#include <bits/stdc++.h>
#include <stdlib.h> 
#include<time.h>
#include <stdio.h> 
#include <chrono> 

using namespace std; 
using namespace std::chrono;
  
void swap(int *xp, int *yp)  
{  
    int temp = *xp;  
    *xp = *yp;  
    *yp = temp;  
}  
  
void bubbleSort(int *arr, int n)  
{  
    int i, j;  
    for (i = 0; i < n-1; i++)      
      
    for (j = 0; j < n-i-1; j++)  
        if (arr[j] > arr[j+1])  
            swap(&arr[j], &arr[j+1]);  
}  
  
void printArray(int *arr, int size)  
{  
    int i;  
    for (i = 0; i < size; i++)  
        cout << arr[i] << " ";  
    cout << endl;  
}

int main()  
{  
    int numOfInt = 0;
    cout << "Please enter the number of integers you would like to be produced at random then sorted: ";
    cin >> numOfInt;
    int arr [numOfInt];  
    
    srand(time(0));
    
    for (int i = 0; i < numOfInt; i++)
        arr[i] = rand();
    
    auto start = high_resolution_clock::now(); 
    bubbleSort(arr, numOfInt);  
    auto stop = high_resolution_clock::now(); 
    auto duration = duration_cast<nanoseconds>(stop - start);
    
    cout<<"Sorted array: \n";  
    printArray(arr, numOfInt);  
    
    cout << "Time taken: " << duration.count() << " ns" << endl;
    return 0;  
}
