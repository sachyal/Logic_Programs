public class Q8p{
    public static void main(String args[]){
        System.out.println("pattern question");
        int i,j,k,n;
        n=0;
        for(i=4; i>=1;i--){
            for(j=1;j<=4; j++){
                System.out.print("");
            }
            for(k=4;k>=i; k--){
                n=n+1;
              System.out.print(n);
            }
            System.out.println();
        }

    }

    
}