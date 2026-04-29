import java.util.Scanner;

class Employee {
    int id;
    String name;
    float salary;
}

class Ctq3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Employee emp = new Employee();
        System.out.println("enter id");
        emp.id = scanner.nextInt();
        System.out.println("name");
        scanner.nextLine();
        emp.name = scanner.nextLine();
        System.out.println("salary");
        emp.salary = scanner.nextFloat();
        System.out.println("id: " + emp.id);
        System.out.println("name: " + emp.name);
        System.out.println("salary: " + emp.salary);
        System.out.println(emp);
    }

}