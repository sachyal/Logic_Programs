import java.util.Scanner;

class Circle {
    public float r;
}

class Ctype {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        float area;
        Circle c = new Circle();
        System.out.println("enter radius");
        c.r = scanner.nextFloat();
        area = 3.14f * c.r * c.r;
        System.out.println("Area" + c.r);
        System.out.println("Area" + area);

    }

}