public class Dwhile{
    public static void main(String args[]){
        System.out.println("count even no.s b/w 1 to 10");
        int i=1;
        int c = 0;
        while (i<=10){
            if (i%2==0){
            System.out.println(i);
            c=c+1;
        } 
        i++;
        }
        System.out.println("count of even numbers b/w 1 to 10 is " +c );
    }
}