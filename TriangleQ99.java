class Triangle {
    float l;
    float b;

    /*
     * public Triangle() {
     * l = 2;
     * b = 3;
     * }
     */

    public Triangle(float x, float y) {
        l = x;
        b = y;
    }

    public void print() {
        System.out.println(l + " " + b);
    }

    public float areat() {
        return (0.5f * l * b);
    }

    public String tostring() {
        return ("length and breadth" + l + b);
    }

    public boolean equals(Triangle t) {
        if (l == t.l && b == t.b) {
            return true;
        }

        else {
            return false;
        }
    }

}

public class TriangleQ99 {
    public static void main(String args[]) {
        Triangle t1 = new Triangle(4, 5);
        t1.print();
        System.out.println(t1);
        float z = t1.areat();
        System.out.println(z);

        Triangle t2 = new Triangle(5, 6);
        Triangle t3 = new Triangle(5, 6);
        Triangle t4 = new Triangle(5, 7);

        boolean flag;

        flag = t2.equals(t3);
        System.out.println(flag);
        flag = t2.equals(t4);
        System.out.println(flag);

        flag = t2 == t3;
        System.out.println(flag);

        flag = t2 == t4;
        System.out.println(flag);

    }

}
