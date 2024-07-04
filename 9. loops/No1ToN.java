import java.util.*;

public class No1ToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int counter = 1; // Initialize counter to 1

        while(counter <= n){
            System.out.println(counter);
            counter++;
        }
    }
}
