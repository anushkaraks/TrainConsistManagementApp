package TrainConsistencyManagementApp;

class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    public void assignCargo(String cargoType) {
        try {
            if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment");
            }
            this.cargo = cargoType;
            System.out.println("Cargo assigned: " + cargoType + " to " + shape + " bogie");
        } catch (CargoSafetyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Cargo assignment attempt completed");
        }
    }

    public String toString() {
        return shape + " bogie carrying " + (cargo == null ? "no cargo" : cargo);
    }
}

public class trainConsistencyManagementApp {

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum");
        System.out.println(b1);

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum");
        System.out.println(b2);

        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Food");
        System.out.println(b3);
    }
}
