public class Q3{
    public static void main(String args[]){
        System.out.println("Solving problem");
        int i, j;
        i=1;
        do {
            j=10;
            do{
                System.out.println(i + " "+ j);
                j=j-3;
            }
            while(j>=0);
            i=i+4;
        }
        while(i<=10);
    }
}