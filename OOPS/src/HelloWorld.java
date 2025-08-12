import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        int arr[] = {1,2,3,4,5};
//        for(int i = 0;i<arr.length;i++){
//            System.out.println(i);
//        }
        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);
        final float pi = 22/7f; // f for float number
        System.out.println(pi);
        float r = sc.nextFloat();
        double Area = pi*r*r;
        System.out.println("Area of circle is - ");
        System.out.println(Area);
    }
}






// final means that , now the value of pi will remain constant