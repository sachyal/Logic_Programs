import java.util.Scanner;

class Student {
    int roll;
    String name;
    float pr;
}

class Ctl {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Student st = new Student();
        String str[] = new String[2];
        System.out.println("enter rollno");
        st.roll = scanner.nextInt();
        System.out.println("enter name");
        scanner.nextLine();
        st.name = scanner.nextLine();
        System.out.println("enter percentage");
        st.pr = scanner.nextFloat();
        System.out.println("roll no: " + st.roll);
        System.out.println("name: " + st.name);
        System.out.println("percentage: " + st.pr);

    }
}