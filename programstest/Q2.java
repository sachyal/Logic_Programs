package programstest;
import java.util.Scanner;


public class Q2 {
    public static void main(String args[]){
        System.out.println("will take gender, marital status,age of person,and insurance is provided if one of conditionsi full filled");
        Scanner scanner=new Scanner(System.in);
        String g;
        String ma="married";
        String ms="single";
        String gm="male";
        String gf="female";
        int a;
        System.out.println("enter your gender");
        g=scanner.nextLine();
        System.out.println("enter your marital status");
       String m=scanner.nextLine();
        System.out.println("enter your age");
        a=scanner.nextInt();
       
        if(m.equals(ma)){
            System.out.println("insurance will be provided");
        }
        else if(m.equals(ms) && g.equals(gm) && a>21){
            System.out.println("insurance will be provided");
        }
        else if(m.equals(ms) && g.equals(gf) && a>18){
            System.out.println("insurance will be provided");
        }
        else {
            System.out.println("not qualified for insurance");
        }


    }
    
}
