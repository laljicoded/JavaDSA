package CRUDOperation;

//Time Complexity O(n),, Space Complexity O(1)

public class palindromearray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 3, 2, 1 };
        int n = arr.length;
        int flag = 0;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - i - 1]) {
                flag = 1;
                System.out.println("It's not palindrome array");
                break;
            }
        }
        if (flag == 0) {
            System.out.println("it's Palindrome array");
        }

    }
}
