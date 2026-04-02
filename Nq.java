public class Nq{
    public static void main(String args[]){
        System.out.println("nested answer checking");
        int i , j ,s;
        s=0;
        for(i=1; i<=2; i++){
            for(j=1;j<=2; j++){
                s=s+i+j;
            }
        }
        System.out.println(s);
    }
}