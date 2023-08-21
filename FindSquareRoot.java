import java.util.*;

public class FindSquareRoot {
    public static int FindSquareroot(int n) {
        int lb = 0, hb = n;
        int result = -1;
        while (lb <= hb) {
            int mid = lb + (hb - lb) / 2;
            int val = mid * mid;
            if (val == n) {
                return mid;
            } else if (val < n) {
                result=mid;
                lb = mid + 1;
                
            } else {
                hb = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        boolean k=true;
        while(k){
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for find Square Root: ");
        int n = sc.nextInt();

        int result = FindSquareroot(n);
        System.out.println("The Square Root of " + n + " is " + result);
        sc.close();
        }
    
    }
}