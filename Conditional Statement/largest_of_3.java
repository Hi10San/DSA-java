public class largest_of_3 {
    public static void main(String args[]) {
        int A = 5;
        int B = 5;
        int C = 3;

        if (A>B && A>C){
            System.out.println("A is largest");
        }
        else if (B>A && B>C){
          System.out.println("B is largest");
        }
        else {
            System.out.println("C is largest");
        }
    }
}
