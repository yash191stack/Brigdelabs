
class Student{
    private String Name;
    private int Age;

    String getName(){
        return Name;
    }
    void setName(String Name){
        this.Name = Name;

    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
//    Student.Name = "Yash";
        obj.setName("Yash");
        System.out.println(obj.getName());
    }
}
