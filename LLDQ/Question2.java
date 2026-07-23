package LLDQ;

class ParkingFullException extends Exception {
    public ParkingFullException() {
        super("ParkingFullException: parking is full.can not park here");
    }

    public ParkingFullException(String Message) {
        super(Message);
    }
}

class InvalidTicketException extends Exception {
    public InvalidTicketException() {
        super("InvalidTicketException: Wrong Ticket");
    }

    public InvalidTicketException(String Message) {
        super(Message);
    }
}

class AlreadyParkedException extends RuntimeException {
    public AlreadyParkedException() {
        super("AlreadyParkedException: Vechile is already park");
    }

    public AlreadyParkedException(String Message) {
        super(Message);
    }
}

class Vehicle {
    protected int id;
    protected String type;
    protected int entryTime;
    protected int slotsNeeded;

    public Vehicle(int id, String type, int entryTime) {
        this.id = id;
        this.type = type;
        this.entryTime = entryTime;
        if (type.equalsIgnoreCase("Car")) {
            this.slotsNeeded = 2;
        } else {
            this.slotsNeeded = 1;
        }
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getEntryTime() {
        return entryTime;
    }

    public int getSlotsNeeded() {
        return slotsNeeded;
    }

    public void displayInfo() {
        System.out.println(
                "Id: " + id + " | Type: " + type + " | EntryTime: " + entryTime + "hr | Slots: " + slotsNeeded);
    }
}

class Car extends Vehicle {
    public Car(int id, int entryTime) {
        super(id, "Car", entryTime);
    }
}

class Bike extends Vehicle {
    public Bike(int id, int entryTime) {
        super(id, "Bike", entryTime);
    }
}

class ParkingLot {
    private Vehicle vehicles[] = new Vehicle[20];
    private int vehicleCount = 0;
    private int usedSlots = 0;
    private int totalSlots = 20;

    public void parkVehicle(Vehicle v) throws ParkingFullException {
        // Check if already parked
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].getId() == v.getId()) {
                throw new AlreadyParkedException(
                        "AlreadyParkedException: Vehicle id " + v.getId() + " is already park");
            }
        }

        // Check slot availability
        if (usedSlots + v.getSlotsNeeded() > totalSlots) {
            throw new ParkingFullException();
        }

        vehicles[vehicleCount++] = v;
        usedSlots += v.getSlotsNeeded();
        System.out.println(v.getType() + " id:" + v.getId() + " parked. Slots used: " + usedSlots + "/" + totalSlots);
    }

    public int exitVehicle(int id, int exitTime) throws InvalidTicketException {
        int index = -1;
        for (int i = 0; i < vehicleCount; i++) {
            if (vehicles[i].getId() == id) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new InvalidTicketException("InvalidTicketException: Ticket id " + id + " not found");
        }

        Vehicle v = vehicles[index];
        int hours = exitTime - v.getEntryTime();
        if (hours < 1)
            hours = 1; // min 1 hour charge

        int rate = v.getType().equalsIgnoreCase("Car") ? 20 : 10;
        int bill = hours * rate;

        // remove vehicle and free slots
        usedSlots -= v.getSlotsNeeded();
        for (int i = index; i < vehicleCount - 1; i++) {
            vehicles[i] = vehicles[i + 1];
        }
        vehicles[vehicleCount - 1] = null;
        vehicleCount--;

        System.out.println(v.getType() + " id:" + id + " exited. Bill: " + bill + "rs");
        return bill;
    }

    // RECURSION: calculate total revenue if all parked vehicles exit now at
    // currentTime
    public int calculateTotalRevenue(int currentTime, int index) {
        if (index >= vehicleCount) { // base case
            return 0;
        }
        Vehicle v = vehicles[index];
        int hours = currentTime - v.getEntryTime();
        if (hours < 1)
            hours = 1;
        int rate = v.getType().equalsIgnoreCase("Car") ? 20 : 10;
        int bill = hours * rate;

        return bill + calculateTotalRevenue(currentTime, index + 1); // recursive call
    }

    public void printStatus() {
        System.out.println("Full Parking Status:");
        for (int i = 0; i < vehicleCount; i++) {
            Vehicle v = vehicles[i];
            System.out.println("[" + v.getType() + " | Id:" + v.getId()
                    + " | Entry:" + v.getEntryTime() + "hr]");
        }
        System.out.println("Slots Used: " + usedSlots + "/" + totalSlots);
    }
}

public class Question2 {
    public static void main(String args[]) {
        ParkingLot p = new ParkingLot();

        Car c1 = new Car(1, 10); // entry at 10hr
        Bike b1 = new Bike(2, 11);
        Car c2 = new Car(3, 9);

        try {
            p.parkVehicle(c1); // Car parked. 2 slots
            p.parkVehicle(b1); // Bike parked. 1 slot
            p.parkVehicle(c1); // AlreadyParkedException
        } catch (ParkingFullException e) {
            System.out.println(e.getMessage());
        } catch (AlreadyParkedException e) {
            System.out.println(e.getMessage());
        }

        try {
            p.parkVehicle(c2); // Car parked. 2 slots. Total=5
        } catch (ParkingFullException | AlreadyParkedException e) {
            System.out.println(e.getMessage());
        }

        try {
            p.exitVehicle(10, 15); // InvalidTicketException
        } catch (InvalidTicketException e) {
            System.out.println(e.getMessage());
        }

        // Exit b1 at 15hr. 4 hours * 10rs = 40rs
        try {
            p.exitVehicle(2, 15);
        } catch (InvalidTicketException e) {
            System.out.println(e.getMessage());
        }

        // Recursion: calculate revenue if c1 and c2 exit at 16hr
        int totalRev = p.calculateTotalRevenue(16, 0);
        System.out.println("Total Revenue if all exit at 16hr: " + totalRev + "rs");

        p.printStatus();
    }
}