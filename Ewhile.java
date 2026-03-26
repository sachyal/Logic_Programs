public class Ewhile{
    public static void main(String args[]){
        System.out.println("sum of even numbers b/w 1 to 10 and their avg");
        int i=1;
        int c =0;
        int s =0;
        int avg;
        while(i<=10){
            if(i%2==0){
                System.out.println("even numbers are " + i);
                s=s+i;
                c=c+1;
            }
            i++;
        }
        System.out.println("sum of even numbers b/w 1 to 10 is " + s );
        System.out.println("count of even numbers b/w 1 to 10 is "+ c );
        avg=s/c;
        System.out.println("avg of even numbers b/w 1 to 10 is "+ avg);
    }
}