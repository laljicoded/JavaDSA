import java.util.*;

public class LinearSearch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int m;
        m=sc.nextInt();
        

        int [] arr=new int[m];
        

        for(int i=0;i<m;i++){

            arr[i]=sc.nextInt();
           
}System.out.println();

System.out.print("{ ");

for(int i=0;i<m;i++){
    System.out.print(arr[i]+" ");
}

System.out.println(" }");

System.out.println("Enter x");
int x=sc.nextInt();
System.out.println("your x is: "+ x);
int indx=-1;
for(int i=0;i<m;i++){
    if(arr[i]==x){
        indx=i;

        break;
    }
}

if(indx==-1){
    System.out.println("Searched element not found");
}else{
    System.out.println("Searched element found at the location "+indx+" Your searched element is: "+ x);
}





    


         
    }
}
