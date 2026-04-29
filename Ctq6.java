import java.util.Scanner;

class Result {
    private int a;
    private int b;
    private int c;

    public void setdata(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }

    public void print() {
        System.out.println("marks of a: " + a + ", b: " + b + ", c: " + c);
    }

    public float pnt() {
        Float prntage;
        prntage = (a + b + c) * 100 / 300f;
        return prntage;
    }
}

class Ctq6 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter marks in first subject");
        int x = scanner.nextInt();
        System.out.println("enter marks in second subject");
        int y = scanner.nextInt();
        System.out.println("enter marks in third subject");
        int z = scanner.nextInt();
        Result r = new Result();
        r.setdata(x, y, z);
        r.print();
        float percentage = r.pnt();
        System.out.println("total percentage is: " + percentage);

    }
}