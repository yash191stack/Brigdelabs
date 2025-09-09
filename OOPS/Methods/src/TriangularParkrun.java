import java.util.Scanner;

public class TriangularParkrun {

    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000.0;
        return (int) Math.ceil(distance / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 sides of the triangle in meters: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        int rounds = calculateRounds(a, b, c);
        System.out.println("Number of rounds needed to complete 5km: " + rounds);

        sc.close();
    }
}
