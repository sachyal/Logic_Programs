abstract class Calculator {
    protected double a;
    protected double b;

    public Calculator() {
        a = 3.5;
        b = 5.5;
    }

    public Calculator(double x, double y) {
        a = x;
        b = y;
    }

    public void printcal() {
        System.out.println(a + " " + b);
    }

    abstract public double area();

    abstract public double sub();

    abstract public double multi();

    abstract public double division();

}

class Maths extends Calculator {

    public Maths(double x, double y) {
        super(x, y);

    }

    public double area() {
        System.out.println("area of rectangle:");
        return a * b;
    }

    public double sub() {
        return a - b;
    }

    public double multi() {
        return a * b;
    }

    public double division() {
        return a / b;
    }
}

class IH3 {
    public static void main(String args[]) {
        Calculator c;
        c = new Maths(6, 3);
        c.printcal();
        double a1 = c.area();
        System.out.println(a1);

        double a2 = c.sub();
        System.out.println(a2);

        double a3 = c.multi();
        System.out.println(a3);

        double a4 = c.division();
        System.out.println(a4);
    }
}
