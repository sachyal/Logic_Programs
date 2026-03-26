public class D{
    public static void main(String args[]){
       System.out.println("even numbers b/w 1 to 10");
       int i;
       int c =0;
       for( i=1; i<=10; i ++){
        if (i%2==0){
            System.out.println(i);
            c=c+1;
        }
        
       }
        System.out.println("even numbers b/w 1 to 10 is " + c);
    }
}