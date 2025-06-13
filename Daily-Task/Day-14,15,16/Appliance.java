
public abstract class Appliance {
        protected String brand;
        protected int power;

        public Appliance(String brand, int power) {
            this.brand = brand;
            this.power = power;
        }

        public abstract void turnOn();

        public void showSpecs() {
            System.out.println("Brand: " + brand + ", Power: " + power + "W");
        }
}
    class Fan extends Appliance {
    public Fan(String brand, int power) {
        super(brand, power);
    }

    @Override
    public void turnOn() {
        System.out.println("Fan is spinning");
    }
}
    class WashingMachine extends Appliance {
    public WashingMachine(String brand, int power) {
        super(brand, power);
    }

    @Override
    public void turnOn() {
        System.out.println("Washing machine is starting wash cycle");
    }
}
     class Mainsssss {
    public static void main(String[] args) {
        Appliance fan = new Fan("Crompton", 50);
        Appliance washer = new WashingMachine("LG", 500);

        fan.showSpecs();
        fan.turnOn();
        washer.showSpecs();
        washer.turnOn();
    }
}

