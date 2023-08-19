import java.util.Scanner;

public class prefixSum2 {


     public static void prefixsum2(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;

        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j] +=arr[i][j-1];
             }
            
            }


            System.out.println("...............................................................");

            for(int j=0;j<n;j++){
                for(int i=1;i<m;i++){
                    arr[i][j] +=arr[i-1][j];
                }
            }
        
        
    }
    public static void main(String[] args) {
        

          System.out.println("Enters Rows and Columns of an array");
      Scanner sc=new Scanner(System.in);
      int m=sc.nextInt();
      int n=sc.nextInt(); 

      int[][] arr=new int[m][n];

      System.out.println("Enters the elements of an array");

      for(int i=0;i<m; i++){
        for(int j=0; j<n;j++){
            arr[i][j]=sc.nextInt();
        }
       }
       
       int a=arr.length;
       int b=arr[0].length;

       for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }
       System.out.println();

      prefixsum2(arr);

       for(int i=0;i<a;i++){
        for(int j=0;j<b;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       }

       
       
       
    }

   
}
