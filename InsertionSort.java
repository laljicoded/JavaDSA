public class InsertionSort {

    public static void Insertionsort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 6, 8, 56, 43, 56, 76, 89, 2, 34, 5 };
        System.out.println("Before Sorting :");

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("After Sorting :");

        Insertionsort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }

    }

}
