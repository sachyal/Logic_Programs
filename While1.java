public class While1{
    public static void main(String args[]){
        int a, b,c,d,s;
        a=2438;
        b=a;
        int r=0;
        s=0;
        c=0;
        while(b>0){
            d=b%10;
            System.out.println(d);
            s=s+d;
            c=c+1;
            r=r*10+d;
            b=b/10;
        }
        System.out.println(c);
        System.out.println(r);

    }
}