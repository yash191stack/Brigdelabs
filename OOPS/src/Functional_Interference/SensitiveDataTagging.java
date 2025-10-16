package Functional_Interference;

public class SensitiveDataTagging {

}

interface SensitiveData {}

class UserData implements SensitiveData {
    String name = "John";
    String password = "Secret@123";
}

class Demo {
    public static void main(String[] args) {
        UserData user = new UserData();
        if (user instanceof SensitiveData)
            System.out.println("Sensitive data: do encryption.");
    }
}
