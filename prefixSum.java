public class prefixSum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        for(var mat:arr){
            System.out.print(mat+ " ");
        }

        System.out.println();

        int sum=0;
        for(int i=1;i<arr.length;i++){
           arr[i] +=arr[i-1];
           

        }
        System.out.println();

        for(var mat:arr){
            System.out.print(mat+ " ");
        }

    }
    
}
