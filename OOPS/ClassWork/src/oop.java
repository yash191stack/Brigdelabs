
class Student{
    private String Name;
    private int Age;

    String getName(){
        return Name;
    }
    String setName(String Name){
        this.Name = Name;
        return Name;
    }

}
public class oop {
    public static void main(String[] args) {
    Student obj = new Student();
//    Student.Name = "Yash";
        obj.setName("Yash");
        System.out.println(getName());
    }
}
