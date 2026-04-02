public class Nq5{
    public static void main(String args[]){
        System.out.println("checking nested loop answer");
        int i , j , s;
        s=0;
        i=1;
        do{
            j=10;
            while(j>=0){
                s=s+i+j;
                j=j-4;
            }
            i=i+5;
        }while(i<=12);
        System.out.println(s);
    }
}