Write a Python function that sorts a list using bubble sort algorithm.

Here is the Python function that implements the bubble sort algorithm:

```Python
def bubble_sort(lst):
    n = len(lst)
    for i in range(n):
        for j in range(0, n-i-1):
            if lst[j] > lst[j+1]:
                lst[j], lst[j+1] = lst[j+1], lst[j]
    return lst
```

You can use the function like this:

```Python
numbers = [64, 34, 25, 12, 22, 11, 90]
print(bubble_sort(numbers))
```

The output will be:

```Python
[11, 12, 22, 25, 34, 64, 90]
```

This function sorts the list in ascending order. If you want to sort the list in descending order, you can modify the comparison in the if statement to `lst[j] < lst[j+1]`. 

Note: Bubble sort is not suitable for large data sets as its average and worst-case complexity are both O(n^2), where n is the number of items being sorted. There are more efficient algorithms like quicksort, mergesort, and heapsort that have average and worst-case complexity of