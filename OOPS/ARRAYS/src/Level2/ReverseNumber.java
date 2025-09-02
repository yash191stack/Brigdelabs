package Level2;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = sc.nextLong();

        int[] digits = new int[20];
        int index = 0;

        while (number != 0) {
            digits[index++] = (int)(number % 10);
            number /= 10;
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }
}
