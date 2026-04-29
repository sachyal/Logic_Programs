import java.util.Scanner;

class Rectangle {
    public int l;
    public int b;

}

class Cra {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int area;
        Rectangle r = new Rectangle();
        System.out.println("enter length");
        r.l = scanner.nextInt();
        System.out.println("enter breadth");
        r.b = scanner.nextInt();
        area = r.l * r.b;

        System.out.println("Length " + r.l);
        System.out.println("Breadth " + r.b);
        System.out.println("Area " + area);
    }
}