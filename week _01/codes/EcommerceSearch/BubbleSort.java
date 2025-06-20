package EcommerceSearch;

public class BubbleSort {
    static void sort(Product[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].productId > arr[j + 1].productId) {
                    Product p = (arr[j+1]);
                    arr[j+1] = arr[j];
                    arr[j] = p;
                }
            }
        }
    }

    static void printArr(Product[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
