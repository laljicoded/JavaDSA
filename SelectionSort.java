public class SelectionSort {
public static void Selectionsort(int[] arr){

    for(int i=0; i<arr.length;i++){
        int min_index=i;
        for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[min_index]){
                min_index=j;
            }
        }
        if(min_index!= i)
        {
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
    }

}

    public static void main(String[] args) {
        int[] arr = { 4, 56, 78, 77, 4, 32, 12, 45, 6, 89, 90 };

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        Selectionsort(arr);

        for (int a : arr) {
            System.out.print(a + " ");
        }

    }

}
