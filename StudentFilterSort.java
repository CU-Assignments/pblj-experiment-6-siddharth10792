import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    double marks;

    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + "%)";
    }
}

public class StudentFilterSort {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85.5));
        students.add(new Student("Bob", 72.0));
        students.add(new Student("Charlie", 78.4));
        students.add(new Student("David", 88.9));
        students.add(new Student("Eva", 95.2));
        students.add(new Student("Frank", 60.1));

        System.out.println("Students scoring above 75%, sorted by marks:");
        
        students.stream()
                .filter(student -> student.getMarks() > 75) 
                .sorted(Comparator.comparingDouble(Student::getMarks)) 
                .map(Student::getName) 
                .forEach(System.out::println); 
    }
}
