import java.util.*;

public class if_else {
    public static void main(String args[]) {
        int age = 15;
        if (age >= 18) {
            System.out.println("You are eligible to vote");
        }
        else if (age >=13 && age <=18){
            System.out.println("teen");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
        
}