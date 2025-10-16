package Functional_Interference;

public class BackgroundJob {

}

class Demo {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Background job running...");
        new Thread(task).start();
    }
}
