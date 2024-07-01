public class Diamond {

    public static void diamond_(int n){
        
        for (int i = 1; i <= n-1; i++){
            
            for (int j = i; j <= n; j++){
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i-1 ; j++){
                System.out.print("*");
                  
            }
            for (int j = 1; j <= i-2 ; j++){
                System.out.print("*");
                  
            }
            
            
            System.out.println();
        }
        
        
        for (int i = n - 1; i >= 1; i--){
            
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        diamond_(5);
    }
}