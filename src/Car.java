public abstract class Car {
    private final String model;
    public Car(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void gas() {
        System.out.println("Газуємо!");
    }
}
class Sedan extends Car {

    public Sedan(String model, double ignoredMaxSpeed) {
        super(model);
    }
    public void brake() {
        System.out.println(getModel() + " гальмує плавно");
    }
}
class Truck extends Car {
    public Truck(String model, double ignoredMaxSpeed) {
        super(model);
    }
    public void brake() {
        System.out.println(getModel() + " гальмує різко");
    }
}
class Teste {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Toyota Camry", 200);
        Truck truck = new Truck("MAN", 120);
        sedan.gas();
        sedan.brake();
        System.out.println();
        truck.gas();
        truck.brake();
    }
}
