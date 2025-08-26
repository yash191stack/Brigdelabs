import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        int ld = 0;
        while (n!=0){
            ld = n%10;
            sum = sum+ld;
            n = n/10;

        }
        System.out.println(sum);
    }
}
