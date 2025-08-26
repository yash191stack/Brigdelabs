import java.util.*;
class sumOfNnumbers {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for(int i = 0;i<=n;i++){
                sum = sum+i;
            }
            System.out.println("The sum is - " + sum);
        }
        else{
            System.out.println(sum);
        }
    }
}
