class Person {
    private int id;
    private String name;
    private float salary;

    public Person() {
        id = 1;
        name = "test1";
        salary = 20.0f;
    }

    public Person(int x, String y, float z) {
        id = x;
        name = y;
        salary = z;
    }

    public String toString() {
        return "id: " + id + "Name: " + name + "Salary: " + salary;
    }

    public boolean equals(Person p) {
        if (this.id == p.id && this.name == name && this.salary == salary) {
            return true;
        } else {
            return false;
        }
    }

}

public class ObjectQ1 {

}
