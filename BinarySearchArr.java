import java.util.Scanner;

public class BinarySearchArr {

    public static int BinarySearch(int[] arr, int a) {
        int lb = 0, hb = arr.length - 1;

        while (lb <= hb) {
            int mid = lb + (hb - lb) / 2;

            if (arr[mid] == a) {
                return mid;

            } else if (arr[mid] < a) {
                lb = mid + 1;
            } else {
                hb = mid - 1;
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (var ma : arr) {
            System.out.print(ma + " ");
        }
        System.out.println();
        System.out.println("Enter searching number");

        int a = sc.nextInt();
        int result = BinarySearch(arr, a);

        if (result == 0) {
            System.out.println("Searched element not found ");
        } else {
            System.out.println("Searched element found at location of " + result);
        }

        sc.close();

    }
}
