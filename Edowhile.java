public class Edowhile{
    public static void main(String args[]){
        System.out.println("sum of all even numbers and their avg b/w 1 to 10");
        int i =1;
        int s=0;
        int c=0;
        int avg;
        do {
            if (i%2==0){
                System.out.println("even number b/w 1 to 10 is " + i);
                s=s+i;
                c=c+1;
            }
            i ++;
        }while(i<=10);
        System.out.println("sum of even numbers is " + s);
        System.out.println("count of even numbers b/w 1 to 10 is "+ c);
        avg=s/c;
        System.out.println("avg of even numbers b/w 1 to 10 is "+ avg);

    }
}