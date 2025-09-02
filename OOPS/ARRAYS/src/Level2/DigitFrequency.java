package Level2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        // Step 2: Find digits and store in array
        int[] digits = new int[20];  // Assumption: max 20 digits
        int index = 0;
        long originalNumber = number;

        while (number > 0) {
            digits[index++] = (int)(number % 10);
            number /= 10;
        }

        // Step 3: Create frequency array
        int[] freq = new int[10];  // Index 0-9 for digits

        for (int i = 0; i < index; i++) {
            freq[digits[i]]++;
        }

        // Step 4: Display frequency
        System.out.println("Digit Frequency in number " + originalNumber + ":");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
    }
}
