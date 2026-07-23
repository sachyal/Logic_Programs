class Laptop {
    String model;
    int price;

    public Laptop(String x, int y) {
        model = x;
        price = y;
    }

    public String toString() {
        return model + ":" + price;
    }

    public boolean equals(Laptop l1) {
        if (model.equals(l1.model) && price == l1.price) {
            return true;
        } else {
            return false;
        }
    }
}

public class ObjectsQ {
    public static void main(String args[]) {

        Laptop l1 = new Laptop("laptop1", 20);
        System.out.println(l1);

        Laptop l2 = new Laptop("laptop2", 40);
        System.out.println(l2);

        boolean result = (l1 == l2);
        System.out.println("Using == : " + result);

        boolean result2 = l1.equals(l2);
        System.out.println("Using equals : " + result2);

        Laptop l3 = new Laptop("laptop1", 20);
        System.out.println("l1.equals(l3): " + l1.equals(l3));
    }
}