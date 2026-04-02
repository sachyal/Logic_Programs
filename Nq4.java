public class Nq4{
    public static void main(String args[]){
        System.out.println("checking nested loop");
        int i , j ,s;
        s=0;
        for(i=1; i<=14; i=i+4){
            j=1;
            while(j<=5){
                s=i+s+j;
                j=j+2;
            }

        }
        System.out.println(s);

    }
}