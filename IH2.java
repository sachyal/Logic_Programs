abstract class Shape {
    protected double l;
    protected double b;

    public void setshape(double x, double y) {
        l = x;
        b = y;
    }

    public Shape(double x, double y) {
        l = x;
        b = y;
    }

    public void printshape() {
        System.out.println("length: " + l + "Breadth: " + b);
    }

    abstract double area();
}

class T extends Shape {

    public T(double x, double y) {
        super(x, y);
    }

    public double area() {
        return 0.5 * l * b;
    }
}

class R extends Shape {

    public R(double x, double y) {
        super(x, y);

    }

    public double area() {
        return l * b;
    }
}

class IH2 {
    public static void main(String args[]) {
        /*
         * Shape s = new Shape();
         * s = new T();
         * s.setshape(4, 6);
         * double x = s.area();
         * System.out.println("area of triangle: " + x);
         * 
         * s = new R();
         * s.setshape(5,
         * 10);
         * double y = s.area();
         * System.out.println("area of Rectangle: " + y);
         */

        Shape s;
        s = new T(4, 5);
        double a = s.area();
        System.out.println(a);

        s = new R(5, 6);
        double b = s.area();
        System.out.println(b);
    }

}