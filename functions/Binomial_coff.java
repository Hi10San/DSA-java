public class Binomial_coff {

    public static int factorial_(int n){
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int bincoff(int n , int r){
        int n_fact = factorial_(n);
        int r_fact = factorial_(r);
        int nmr_fact = factorial_(n-r);
        int bino_coff = n_fact / (r_fact * nmr_fact);
        return bino_coff;
    }
    public static void main(String[] args) {
        int n = 5;
        int r  = 2;
        System.out.println(bincoff(n,r));
    }
}
