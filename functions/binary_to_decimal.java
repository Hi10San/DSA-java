public class binary_to_decimal {

    public static void binToDec(int binNum){
        int decNum = 0;
        int pow = 0;

        while (binNum>0){
            int last_digit = binNum % 10;
            decNum += last_digit * Math.pow(2, pow);
            pow ++;
            binNum /= 10;
        }
        System.out.println(decNum);
    }
    public static void main(String[] args) {
        binToDec(111);
    }
}
