package Functional_Interference;

public class PasswordStrength {

}

interface SecurityUtils {
    static boolean isStrongPassword(String s) {
        return s.length() >= 8 && s.matches(".*[A-Z].*") && s.matches(".*[a-z].*") && s.matches(".*\\d.*");
    }
}

class Demo {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("Pass@123"));
    }
}
