import java.util.Arrays;

public class Rotatematrix {

    public static void rotatedmatrix(int[][] arr){
        //step 1 transpose the matrix xhange column to row
        int m=arr.length;
        int n=arr[0].length;

        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        //step two swapping......

        for(int i=0;i<m;i++){
            int li=0;
            int ri=n-1;

            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;

                li++;
                ri--;

                // System.out.println(temp);
            }
        }

    }
    public static void main(String[] args) {
         int [][] arr={
            {2,3,4,5},
            {7,8,9,5},
            {34,56,78,65},
            {23,45,32,12}

        };
        
        System.out.println("Before rotating");

       
        for(var mat:arr){
            System.out.println(Arrays.toString(mat));
        }

        System.out.println();

        System.out.println("After rotating");

       rotatedmatrix(arr);

        for(var mat:arr){
            System.out.println(Arrays.toString(mat));
        }
       

    }
}
