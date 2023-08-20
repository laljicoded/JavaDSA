import java.util.Arrays;

public class MaximumMinarr {
    public static void main(String[] args) {
        int [] arr={1,2,3,10,7,80,23,34,4};

        int max =arr[0];
        int a=arr.length;
        
        Arrays.sort(arr);

        System.out.println(arr[a-2]);


        for(int i=1;i<a;i++){
            if(max<arr[i]){     //in minn  min>aee[i];  replace max to min everywhere
                max=arr[i];
            }
        }

        System.out.println(max);

        

       
        
    }
}



