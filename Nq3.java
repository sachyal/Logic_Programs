public class Nq3{
    public static void main(String args[]){
        System.out.println("checking answer");
        int i , j , s;
        s=0;
        for(i=10; i>=1; i=i-4){
            for(j=8; j>=1; j=j-4){
                s=s+i+j;
            }
        }
        System.out.println(s);
    }
}