import java.util.HashMap;

public class HashMap_ex1 {
    public static void main(String[] args) {

        HashMap<String, Student> studentHashMap = new HashMap<>();
        studentHashMap.put("student1", new Student("Harry"));
        System.out.println(studentHashMap.get("student1"));
    }
}

class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }
}
