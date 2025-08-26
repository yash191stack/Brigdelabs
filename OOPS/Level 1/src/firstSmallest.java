import java.util.*;
public class firstSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if((a<b) && (a<c)){
            System.out.println("yes a is smallest among three numbers");
        }
        else{
            System.out.println("no a is not smallest");
        }

    }
}
