abstract class Shape {
    protected int l;
    protected int b;

    public Shape(int x, int y) {
        l = x;
        b = y;
    }

    public void printshape() {
        System.out.println("length: " + l + " Breadth: " + b);
    }

    abstract int area();
}

class Rectangle extends Shape {

    public Rectangle(int x, int y) {
        super(x, y);
    }

    public int area() {
        System.out.println("area of Rectangle: ");
        return l * b;
    }
}

class Triangle extends Shape {
    public Triangle(int x, int y) {
        super(x, y);
    }

    public int area() {
        System.out.println("area of Rectangle: ");
        return l * b;
    }
}

interface Isubstract {
    int subs();
}

interface Imultiplication {
    int multi();
}

class Calculator extends Shape implements Isubstract, Imultiplication {
    public Calculator(int x, int y) {
        super(x, y);
    }

    public int area() {
        System.out.println("can get area of any shape that has l,b example rectangle area:");
        return l * b;
    }

    public int subs() {
        return l - b;
    }

    public int multi() {
        return l * b;
    }

    public void add() {
        System.out.println(l + b);
    }
}

public class InterfaceQ2 {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(3, 5);
        r.printshape();
        int z = r.area();
        System.out.println(z);

        Triangle t = new Triangle(5, 6);
        t.printshape();
        float z2 = t.area();
        System.out.println(z2 * 0.5);

        Isubstract iss;
        iss = new Calculator(2, 3);
        int a = iss.subs();
        System.out.println(a);

        Imultiplication imm;
        imm = new Calculator(2, 2);
        int a1 = imm.multi();
        System.out.println(a1);

        Calculator c = new Calculator(8, 8);
        int a3 = c.area();
        System.out.println(a3);
        c.add();
        c.printshape();
    }
}