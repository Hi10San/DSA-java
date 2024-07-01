public class function_over_datatype {

    // func to calc 2 int numbers
    public static int add(int a, int b) {
        return a + b;
    }
    // func to calc 2 float numbers
    public static float add(float a, float b) {
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1.2f,2.2f));
    }
}
