import java.util.*;

public class Trapping_Rainwater {

    public static int Rainwater(int arr[]){
        // calculate left max boundary - array
        int leftMax[] = new int[arr.length];
        leftMax[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            leftMax[i] = Math.max(leftMax[i-1],arr[i]);
        }
        // calculate rigth max boundary - array
        int rightMax[] = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],arr[i]);
        }
        // loop
        int trappedwater = 0;
        for(int i=0;i<arr.length;i++){
        // waterLevel = min(leftmax boundary , rigthmax boundary)
        int waterLevel = Math.min(leftMax[i],rightMax[i]);
        // trapped watter = watterLevel - heigth[i]
        trappedwater += waterLevel - arr[i];
        }
        return trappedwater;

    }  

    public static void main(String[] args) {
        int[] arr={4,2,0,6,3,2,5};
        System.out.println(Rainwater(arr));
    }
}
       
