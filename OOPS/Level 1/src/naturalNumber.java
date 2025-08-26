import java.util.*;
public class naturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            System.out.println(n*(n+1)/2);
        }
    }
}
