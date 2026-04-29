public class Cmlq2 {
    public static void main(String args[]) {
        int i;
        int l = args.length;
        int s = 0;
        System.out.println("No of data passed" + l);
        for (i = 0; i < l; i++) {
            s = s + Integer.parseInt(args[i]);
        }
        System.out.println(s);
    }

}
