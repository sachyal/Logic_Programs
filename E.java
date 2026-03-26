public class E{
    public static void main(String args[]){
        System.out.println("sum of all even no.s and their average b/w 1 to 10");
        int i =1;
        int s=0;
        int c=0;
        int avg;
        for ( i=1; i<=10; i++){
            if(i%2==0){
                System.out.println("even numbers b/w 1 to 10 is " + i);
                c=c+1;
                s= s+i;
            }
        }
        System.out.println("sum of even no.s b/w 1 to 10 is " + s);
        avg=s/c;
        System.out.println("avg of even no.s b/w 1 to 10 is "+ avg );
    }
}