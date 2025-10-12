```cpp
#include <iostream>
using namespace std;

void bubbleSort(int arr[], int n) {
    // Traverse through all elements in the array
    for (int i = 0; i < n-1; i++) {
        // Last i elements are already sorted, so we skip them.
        for (int j = 0; j < n-i-1; j++) {
            // Traverse through the array from 0 to n-i-1
            // Swap if the element found is greater than the next element
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}

int main() {
    // Example usage:
    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    int n = sizeof(arr) / sizeof(arr[0]);
    
    cout << "Original array: \n";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
        
    bubbleSort(arr, n);
    
    cout << "\n\nSorted array:\n";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
    return 0;
}
```