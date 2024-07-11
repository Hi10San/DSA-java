public class Trapping_Rainwater {

    public static int Rainwater(int arr[]){
        int height = 0;
        int width = 0;
        int area = 0;
        for (int i = 0;i<arr.length;i++){
            for (int j =0;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    height = arr[i];
                    width +=1;
                    area = height*width;
                }
                if (arr[i]>arr[j]){
                    height = arr[i]-arr[j];
                    width = 1;
                    area = height*width;
                }
            }
            
        }
        return area;

    }  
    public static void main(String[] args) {
        int[] arr={4,2,0,6,3,2,5};
        System.out.println(Rainwater(arr));
    }
}
   