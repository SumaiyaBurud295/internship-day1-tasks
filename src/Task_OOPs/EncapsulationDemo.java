package Task_OOPs;
public class EncapsulationDemo {

    public static void main(String[] args) {

        // Creating object of Car
        Car c1 = new Car();

        // Setting values using setters
        c1.setBrand("Toyota");
        c1.setSpeed(120);

        // Printing values using getters
        System.out.println("Brand: " + c1.getBrand());
        System.out.println("Speed: " + c1.getSpeed() + " km/h");
    }
}

    class Car {

        // Private attributes (data protected)
        private String brand;
        private int speed;

        // Getter method (read value)
        public String getBrand() {
            return brand;
        }

        // Setter method (modify value)
        public void setBrand(String brand) {
            this.brand = brand;
        }

        // Getter method
        public int getSpeed() {
            return speed;
        }

        // Setter method
        public void setSpeed(int speed) {
            this.speed = speed;
        }
    }
