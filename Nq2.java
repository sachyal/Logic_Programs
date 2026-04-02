public class Nq2{
    public static void main(String args[]){
        System.out.println("checking answer");
        int i, j, s;
        s=0;
        for(i=1; i<=5; i=i+2){
            for(j=1; j<=8; j=j+3){
                s=s+i+j;
            }

        }
        System.out.println(s);
    }
}