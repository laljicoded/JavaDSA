import java.util.Scanner;

public class sumparticular2dmatrix {



    public  static int findSumMatrix(int[][] arr, int r1,int c1, int r2, int c2){
        int sum=0;
        int a=arr.length;
        int b=arr[0].length;

        for(int i=r1; i<=r2; i++){
            for(int j=c1; j<=c2; j++){
                if(r2>a || c2>b){
                    System.out.println("you are out of array limit it's not processing");
                    break;
                    
                }else{
                    sum +=arr[i][j];
                }
            }
        }

        return sum;

    }
    public static void main(String[] args) {

        boolean running=true;

        while(running){

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
       

         int r1,c1,r2,c2;

         System.out.println("Enter row 1");
         r1=sc.nextInt();

         System.out.println("Enter the column 1");
         c1=sc.nextInt();
          System.out.println("Enter row 2");
          r2=sc.nextInt();

          System.out.println("enter column 2");
          c2=sc.nextInt();

          System.out.println("the coordinates of row and column are arr["+r1+"]["+ c1 +"] , and last coordinate arr["+r2+"]["+c2+"]");

          int result =findSumMatrix(arr,r1,c1,r2,c2);
          System.out.println("sum of matrix is: "+ result);


        }

        



    }
}
