class Circle {
    private int r;

    public void setdata(int x) {
        r = x;
    }

    public float area() {
        float a;
        a = 3.14f * r * r;
        return a;
    }

    public void print() {
        System.out.println("value of r: " + r);
    }
}

class Ctq5 {

    public static void main(String args[]) {
        Circle c = new Circle();
        int x = 3;
        float z;
        c.setdata(x);
        z = c.area();
        System.out.println("Area of circle is: " + z);
        c.print();

    }

}