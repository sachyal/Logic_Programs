interface Iadd {
    int add(int x, int y);

    default int sub(int x, int y) {
        return x - y;
    }
}

class C implements Iadd {
    public int add(int x, int y) {
        return x + y;
    }

}

class InterfaceQ3 {
    public static void main(String args[]) {
        C c1 = new C();
        int z1 = c1.add(4, 5);
        System.out.println("sum of both values: " + z1);

        c1.sub(6, 7);
    }

}
