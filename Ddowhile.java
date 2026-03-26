public class Ddowhile{
public static void main(String args[]){
    System.out.println("counting the even numbers b/w 1 to 10");
    int i=1;
    int c=0;
    do {
        if(i%2==0){
        System.out.println(i);
        c=c+1;
        }
        
        i++;

    }while(i<=10);
    System.out.println("count of even numbers b/w 1 to 10 is " + c);
}
}