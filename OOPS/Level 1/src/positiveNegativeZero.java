import java.util.Scanner;

public class positiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println("the number is positive");
        }
        else if(n==0){
            System.out.println("the number is zero");
        }
        else{
            System.out.println("the number is negative");
        }
    }
}
