public class inverted_py_numb {

    public static void inverted_py_number(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
        System.out.println();
        }
    } 
    public static void main(String[] args) {
        inverted_py_number(5);
    }
}
