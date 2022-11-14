class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    private String color;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
    public String startEngine(){
        return "Car -> start engine";
    }
    public String accelerate(){
        return "Car -> accelerate";
    }
    public String brake(){
        return "Car -> brake";
    }

static class Mercedes extends Car{
        public Mercedes(int cylinders, String name) {
            super(cylinders, name);
        }
        @Override
        public String startEngine(){
            return getClass().getSimpleName() + " -> start engine";
        }
        @Override
        public String accelerate(){
            return getClass().getSimpleName() + " -> accelerate";
        }
        @Override
        public String brake(){
            return getClass().getSimpleName() + " -> brake";
        }

    }

static class BMW extends Car {
        public BMW(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return getClass().getSimpleName() + " -> start engine";
        }

        @Override
        public String accelerate() {
            return getClass().getSimpleName() + " accelerate";
        }

        @Override
        public String brake() {
            return getClass().getSimpleName() + " -> brake";
        }

    }
}
class Audi extends Car{
    public Audi(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return getClass().getSimpleName() + " -> start engine";
    }
    @Override
    public String accelerate(){
        return getClass().getSimpleName() + " -> accelerate";
    }
    @Override
    public String brake(){
        return getClass().getSimpleName() + " -> brake";
    }

}
class Main1{
    public static void main(String[] args) {
        Audi audi = new Audi(8, "Audi Q7");
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());


        Car.Mercedes mercedes = new Car.Mercedes(8, "S580");
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());

        Car.BMW bmw = new Car.BMW(8, "BMQ X7");
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());


    }
}