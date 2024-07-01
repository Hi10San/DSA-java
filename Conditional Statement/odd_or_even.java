import java.util.*;

public class odd_or_even {
    public static void main(String args[]) {
        // int A = 2;
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();

        if (A % 2 == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}
