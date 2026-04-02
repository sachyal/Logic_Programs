public class P1{
    public static void main(String args[]){
        int i,j,s;
        s=0;
        for(i=1;i<=7;i=i+4){
            s=s+1;
            for(j=5;j>=1;j=j-3){
                s=s+i+j;
            }
                s=s+j;
            }
            System.out.println(s);
        }

    }
