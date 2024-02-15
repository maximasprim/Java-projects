//Reverse Integer
import java.util.Scanner;
public class ReverseInteger{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();
        scanner.close();
        
        System.out.println(reverseInteger(input));
    }

    public static int reverseInteger(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }
}