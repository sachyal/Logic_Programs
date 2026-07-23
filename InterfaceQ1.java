interface ISub {
    int sub(int x, int y);
}

interface IMulti {
    int multi(int x, int y);
}

class Cadd {
    public int add(int x, int y) {
        return x + y;
    }
}

class Cal extends Cadd implements ISub, IMulti {
    public int sub(int x, int y) {
        return x - y;
    }

    public int multi(int x, int y) {
        return x * y;
    }
}

public class InterfaceQ1 {
    public static void main(String args[]) {
        int x;
        Cal c = new Cal();
        x = c.add(4, 8);
        System.out.println(x);

        x = c.sub(6, 3);
        System.out.println(x);

        x = c.multi(4, 5);
        System.out.println(x);

        ISub is;
        is = new Cal();
        x = is.sub(4, 7);
        System.out.println(x);

        IMulti im;
        im = new Cal();
        x = im.multi(4, 7);
        System.out.println(x);

    }

}
