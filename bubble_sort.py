Write a Java function that sorts a list using bubble sort without example of usage.

```java
public class Main {
    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap list.get(j) and list.get(j+1)
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}
```

This function sorts the list in ascending order. It works by repeatedly swapping the adjacent elements if they are in wrong order. The process is repeated until the list is sorted. The outer loop represents the number of passes through the list, and the inner loop represents the number of comparisons and swaps in each pass. The bubble sort algorithm has a worst-case and average time complexity of O(n^2), where n is the number of items being sorted. It is not suitable for large lists as its average and worst-case complexity are of higher order. However, it can be efficient if the list is small or nearly