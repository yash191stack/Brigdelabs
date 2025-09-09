import java.util.Scanner;

public class SpringSeasonChecker {

    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
                (month == 6 && day <= 20) ||
                (month > 3 && month < 6);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        boolean spring = isSpringSeason(month, day);
        System.out.println(spring ? "It's a Spring Season" : "Not a Spring Season");

        sc.close();
    }
}
