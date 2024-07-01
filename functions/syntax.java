import java.util.*;

public class syntax {
    public static void printhelloworld(){
        System.out.println("Hello World");
    }

    public static int sum(int a,int b){
        
        int sum = a + b;
        return sum;
    }
    public static void main(String args[]) {
        //  printhelloworld();   syntax without parameters
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);  
    }
}



