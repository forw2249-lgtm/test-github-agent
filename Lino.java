Here is the clean, production-ready Java code for the Linear Algorithm:

public class Lino {
    public static int[] linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return new int[]{i};
            }
        }
        return new int[]{-1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int target = 6;
        int[] result = linearSearch(arr, target);
        if (result[0] != -1) {
            System.out.println("Element found at index " + result[0]);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}