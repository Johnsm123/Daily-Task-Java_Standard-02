public  interface Vehicle {
        void start();
        void stop();
    }

    class Car implements Vehicle {
        @Override
        public void start() {
            System.out.println("Car engine started");
        }

        @Override
        public void stop() {
            System.out.println("Car engine stopped");
        }
    }

    class Bike implements Vehicle {
        @Override
        public void start() {
            System.out.println("Bike engine started");
        }

        @Override
        public void stop() {
            System.out.println("Bike engine stopped");
        }
    }

    class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        System.out.println("Testing Car:");
        car.start();
        car.stop();

        System.out.println("\nTesting Bike:");
        bike.start();
        bike.stop();
    }
}

