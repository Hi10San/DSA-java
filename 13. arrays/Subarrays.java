public class Subarrays {

    public static void Sub_array(int arr[]){
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=i+1;j<=arr.length-1;j++){
                System.out.print("[");
                sum=0;
                for (int z=i;z<=j;z++){
                    System.out.print(arr[z]+",");
                    sum=sum+arr[z];
                }
                System.out.println("]");
                System.out.println("Sum of subarray is "+sum);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        Sub_array(arr);
    }
}
