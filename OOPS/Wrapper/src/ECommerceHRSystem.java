import java.util.*;

public class ECommerceHRSystem {

    // Task 1 & 4: Shopping Cart Price Calculation
    public static int calculateTotalPrice(String[] priceStrings) {
        int total = 0;
        for (String price : priceStrings) {
            try {
                int value = Integer.parseInt(price);
                total += value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price skipped: " + price);
            }
        }
        return total;
    }

    // Task 2 & 5: Employee Data Processing
    public static void processEmployeeAges(int[] agesArray) {
        ArrayList<Integer> ageList = new ArrayList<>();
        for (int age : agesArray) {
            ageList.add(Integer.valueOf(age)); // Autoboxing also works
        }

        int youngest = Collections.min(ageList);
        int oldest = Collections.max(ageList);

        System.out.println("Employee Ages: " + ageList);
        System.out.println("Youngest Age: " + youngest);
        System.out.println("Oldest Age: " + oldest);
    }

    // Task 3: User Input Validation (Login System)
    public static boolean isValidAge(String ageInput) {
        try {
            int age = Integer.parseInt(ageInput);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Main method to test all tasks
    public static void main(String[] args) {
        // Task 1 & 4 Test
        String[] prices = {"250", "499", "99", "abc", "100"};
        int totalPrice = calculateTotalPrice(prices);
        System.out.println("Total Cart Price: ₹" + totalPrice);

        // Task 2 & 5 Test
        int[] employeeAges = {25, 32, 45, 19, 60, 38};
        processEmployeeAges(employeeAges);

        // Task 3 Test
        String userAge = "21";
        System.out.println("Is age valid and ≥18? " + isValidAge(userAge));

        String invalidAge = "abc";
        System.out.println("Is age valid and ≥18? " + isValidAge(invalidAge));
    }
}
