import java.util.*;

public class BubbleSortArr {

    public static void sortedArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;

                }

            }
            if (!swapped) {
                break;
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Your array is : ");

        for (var as : arr) {
            System.out.print(as + " ");
        }
        System.out.println();

        sortedArray(arr);
        System.out.println("your sorted array is : ");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }

}

// array already
// present...............................................................................................

// public class BubbleSortArr {

// public static void bubbleSort(int[] arr){
// for(int i=0; i<arr.length;i++){
// boolean swapped=false;
// for(int j=0;j<arr.length-i-1;j++){
// if(arr[j]>arr[j+1]){
// int temp=arr[j];
// arr[j]=arr[j+1];
// arr[j+1]=temp;
// swapped=true;
// }
// }
// if(!swapped){
// break;
// }
// }
// }

// public static void main(String[] args) {
// int [] arr={3,4,78,98,9,43,23,456,765,789,2,3,5,67};

// bubbleSort(arr);

// System.out.println("Your sorted array is : ");
// System.out.println(Arrays.toString(arr));

// }

// }
