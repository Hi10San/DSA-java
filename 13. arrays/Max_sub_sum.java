public class Max_sub_sum {

    public static void Sub_array(int arr[]){
        int sum=0;
        int sum2=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                sum=0;
                for (int z=i;z<=j;z++){
                    sum+=arr[z];
                }
                System.out.println(sum);
                if (sum2<sum){
                    sum2=sum;
                }
            }
        }
        System.out.println("Max Sum = "+sum2);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Sub_array(arr);
    }
}
