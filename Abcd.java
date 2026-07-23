public class Abcd {
    public static void main(String args[]) {
        String str = "abcd";
        int l = str.length();
        String str2 = "";
        for (int i = 0; i < l; i++) {
            char x = str.charAt(i);
            str2 = str2 + x;
            System.out.print(str2 + " ");

        }
        for (int i = l - 1; i >= 0; i--) {
            String str3 = "";
            for (int j = 0; j < i; j++) {
                str3 = str3 + str.charAt(j);

            }
            System.out.print(str3 + " ");
        }
    }
}

