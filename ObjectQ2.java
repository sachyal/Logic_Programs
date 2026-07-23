class Laptop {
    String model;
    int price;

    public Laptop(String m, int p) {
        model = m;
        price = p;
    }

    @Override
    public String toString() {
        return model + ":" + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true; // same reference
        if (obj == null || getClass() != obj.getClass())
            return false;

        Laptop other = (Laptop) obj;
        return price == other.price && model.equals(other.model);
    }

    @Override
    public int hashCode() {
        // Simple formula combining fields
        return model.hashCode() + price;
    }
}

public class ObjectQ2 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Dell", 50000);
        Laptop l2 = new Laptop("Dell", 50000);

        System.out.println("l1.equals(l2): " + l1.equals(l2));
        System.out.println("l1.hashCode(): " + l1.hashCode());
        System.out.println("l2.hashCode(): " + l2.hashCode());

        // Using in HashSet
        java.util.HashSet<Laptop> set = new java.util.HashSet<>();
        set.add(l1);
        set.add(l2); // won't add duplicate because equals + hashCode match
        System.out.println("HashSet size: " + set.size());
    }
}
