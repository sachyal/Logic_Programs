public class ExceptionQ2 {
    public static void main(String args[]) {
        try {
            System.out.println("1");
            int x = Integer.parseInt(args[0]);
            System.out.println("2");
            int y = Integer.parseInt(args[1]);
            System.out.println("3");
            int z = x / y;
            System.out.println("4");
        } catch (ArrayIndexOutOfBoundsException ai) {
            System.out.println("5");
            System.out.println("Exception caught " + ai.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println("6");
            System.out.println("Exception caught" + ae.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("7");
            System.out.println("Exception caught" + nfe.getMessage());
        } finally {
            System.out.println("8");
        }
        System.out.println("9");
    }

}
