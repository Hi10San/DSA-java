public class o_1_triangle {

    public static void triangle_0_1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
        System.out.println();
                 
        }
    }
    public static void main(String[] args) {
        triangle_0_1(5);
    }
}
