import java.util.Scanner;

public class BinarySearchLboundarr {

    public static int BinarySearch(int[] arr, int a) {
        int lb = 0, hb = arr.length - 1;
        int result=-1;

        while (lb <= hb) {
            int mid = lb + (hb - lb) / 2;

            if (arr[mid] == a) {
                result= mid;
                hb=mid-1;

            } else if (arr[mid] < a) {
                lb = mid + 1;
            } else {
                hb = mid - 1;
            }

        }
        return result;

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

        if (result == -1) {
            System.out.println("Searched element not found ");
        } else {
            System.out.println("Searched element first occurence found at location of " + result);
        }

        sc.close();

    }
}
