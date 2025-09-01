import java.util.*;
class givenTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the target");
        int target = sc.nextInt();
        System.out.println("enter size of array");
        int size = sc.nextInt();
        System.out.println("enter array");
        int arr[] = new int[size];
        for(int i = 0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i<size;i++){
            if(arr[i]==target){
                System.out.println("yes target exists at " + i);
                break;
            }
            else{
                System.out.println("-1");
                break;
            }
        }
    }
}
