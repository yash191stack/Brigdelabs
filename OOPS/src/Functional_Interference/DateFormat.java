package Functional_Interference;

public class DateFormat {

}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {
    static String formatDate(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }
}

class Demo {
    public static void main(String[] args) {
        System.out.println(DateUtils.formatDate(LocalDate.now(), "dd-MM-yyyy"));
    }
}
