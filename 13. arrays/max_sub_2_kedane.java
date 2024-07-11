public class max_sub_2_kedane {

        public static void Sub_array(int arr[]){
            int sum=0;
            int sum2=Integer.MIN_VALUE;
            for (int i = 0; i <arr.length;i++){
                sum+=arr[i];
                sum2=Math.max(sum,sum2);
                if (sum<0){
                    sum=0;
                }
            }
            System.out.println(sum2);
        }
        public static void main(String[] args) {
            int[] arr = {-1, -2, -3, -4, -5};
            Sub_array(arr);
        }
    }
    

