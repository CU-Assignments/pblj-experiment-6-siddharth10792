import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 30, 50000));
        employees.add(new Employee("Bob", 40, 70000));
        employees.add(new Employee("Charlie", 35, 60000));
        employees.add(new Employee("David", 25, 40000));

        System.out.println("Sorting by name:");
        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        employees.forEach(System.out::println);
        System.out.println("\nSorting by age:");
        Collections.sort(employees, (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge()));
        employees.forEach(System.out::println);

        System.out.println("\nSorting by salary:");
        Collections.sort(employees, (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));
        employees.forEach(System.out::println);
    }
}
