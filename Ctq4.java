import java.util.Scanner;

class Calculate {
    private float a;
    private float b;

    public void setdata(float x, float y) {
        a = x;
        b = y;
    }

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
    }

    public void init() {
        a = 10;
        b = 10;
    }

    public void print() {
        System.out.println("a= " + a + "b= " + b);

    }

    public float add() {
        float x;
        x = a + b;
        return x;
    }
}

class Ctq4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float x, y, z;
        x = sc.nextFloat();
        y = sc.nextFloat();
        Calculate c = new Calculate();
        c.setdata(x, y);
        c.print();
        z = c.add();
        System.out.println("sum of a and b is " + z);
    }
}