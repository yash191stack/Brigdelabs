import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {

        // Map for student name + grade
        Map<String, Double> grades = new HashMap<>();

        // 1. Add students
        grades.put("Yash", 85.5);
        grades.put("Aman", 92.0);
        grades.put("Riya", 76.5);
        grades.put("Karan", 88.0);

        // 2. Update grade (student re-takes test)
        grades.put("Riya", 90.0);   // overwrite ho jaata hai

        // 3. Remove a student
        grades.remove("Karan");

        // 4. Print sorted by name
        System.out.println("Students sorted by name:");
        grades.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
    }
}
