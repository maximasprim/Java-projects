//Power Of Two
import java.util.Scanner;
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num=scanner.nextInt();
        scanner.close();

        System.out.println(isPowerOfTwo(num));
    }

    public static boolean isPowerOfTwo(int n){
        if(n <=0){
            return false;
        }
        //a power of two has only one bit set in its binary represenation
        //if n is a power of two,n & (n-1) will be 0
        return (n & (n-1))==0;
    }
}
