import java.util.*;
class facTor {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println("The factors of n are  - " + count);
        if (count>2){
            System.out.println("not a prime number");
        }
        else{
            System.out.println(" yes its a prime number");
        }
    }
}
