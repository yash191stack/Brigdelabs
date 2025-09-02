package Level1;

import java.util.Scanner;

public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = sc.nextDouble();

            if (num <= 0 || index == 10) break;

            nums[index] = num;
            index++;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            total += nums[i];
            System.out.println("Number " + (i + 1) + ": " + nums[i]);
        }

        System.out.println("Sum of numbers = " + total);
        sc.close();
    }
}
