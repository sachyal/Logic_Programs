package LLDQ;

class InvalidTimeException extends Exception {
    public InvalidTimeException() {
        super("InvalidTimeException: Hours must be positive");
    }

    public InvalidTimeException(String message) {
        super(message);
    }
}

class ExcedLimitException extends Exception {
    public ExcedLimitException() {
        super("ExcedLimitException: only store 5 vehicles.");
    }

    public ExcedLimitException(String message) {
        super(message);
    }
}

abstract class Vehicle {
    protected String plateNumber;
    protected String ownerName;
    public static int totalCount = 0;

    public Vehicle(String plateNumber, String ownerName) {
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
        totalCount++;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void displayInfo() {
        System.out.println("--- Receipt --- " + "\nPlate : " + plateNumber + "\nOwner : " + ownerName);
    }

    abstract public void parkingFee(int hours) throws InvalidTimeException;
}

class FourWheeler extends Vehicle {
    public FourWheeler(String plateNumber, String ownerName) {
        super(plateNumber, ownerName);
    }

    public void parkingFee(int hours) throws InvalidTimeException {
        int charge;

        if (hours <= 0) {
            throw new InvalidTimeException("InvalidTimeException : Hours must be positive");
        }
        charge = 30 * hours;
        displayInfo();
        System.out.println("Hours: " + hours + "\nRate: RS.30/hr" + "\nTotal: Rs." + charge);

    }

    public void displayInfo() {
        super.displayInfo();
    }
}

class TwoWheeler extends Vehicle {
    public TwoWheeler(String plateNumber, String ownerName) {
        super(plateNumber, ownerName);
    }

    public void parkingFee(int hours) throws InvalidTimeException {
        int charge;

        if (hours <= 0) {
            throw new InvalidTimeException("InvalidTimeException : Hours must be positive");
        }
        charge = 10 * hours;
        displayInfo();
        System.out.println("Hours: " + hours + "\nRate: RS.10/hr" + "\nTotal: Rs." + charge);

    }

    public void displayInfo() {
        super.displayInfo();
    }
}

public class Question3 {
    public static void main(String args[]) {
        Vehicle pl[] = new Vehicle[5];

        FourWheeler fw = new FourWheeler("KA01AB1234", "Amit");

        TwoWheeler tw = new TwoWheeler("MH02CD5678", "Sara");
        pl[0] = tw;
        pl[1] = fw;

        for (int i = 0; i < pl.length; i++) {
            if (pl[i] != null) {
                try {
                    if (i == 0) {
                        pl[i].parkingFee(3);
                    } else {
                        pl[i].parkingFee(-2);
                    }
                } catch (InvalidTimeException ite) {
                    System.out.println(ite.getMessage());
                } finally {
                    System.out.println("Transaction closed");
                }
            }
        }

        for (int i = 0; i < pl.length; i++) {
            if (pl[i] != null) {
                if (pl[i] instanceof FourWheeler) {
                    System.out.println(pl[i].getPlateNumber() + " Large spot");
                }
                if (pl[i] instanceof TwoWheeler) {
                    System.out.println(pl[i].getPlateNumber() + " Compact spot");
                }

            }
        }
        System.out.println("Total Vehicles parked: " + Vehicle.totalCount);

    }
}