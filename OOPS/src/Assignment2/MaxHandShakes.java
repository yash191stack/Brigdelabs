import java.util.Scanner;

class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int handshakes = n * (n - 1) / 2;
        System.out.println("The maximum number of handshakes possible among " + n + " students is " + handshakes);
    }
}
