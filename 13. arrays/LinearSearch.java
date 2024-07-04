import java.util.*;

public class LinearSearch {

    public static boolean linearSearch(int arr[], int target){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // int target = 3;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the target number: ");
        int target = sc.nextInt();
        boolean result = linearSearch(arr, target);
        System.out.println(result);
    }
}