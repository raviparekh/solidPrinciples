package Builder;

public class Vehicle {

    private String make;
    private String model;
    private String colour;
    private String plateNum;
    private int doors;
    private double price;

    private Vehicle(Builder builder){
        this.make = builder.make;
        this.model = builder.model;
        this.colour = builder.colour;
        this.plateNum = builder.plateNum;
        this.doors = builder.doors;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", plateNum='" + plateNum + '\'' +
                ", doors=" + doors +
                ", price=" + price +
                '}';
    }

    public static class Builder {
        private String make;
        private String model;
        private String colour;
        private String plateNum;
        private int doors;
        private double price;

        public Builder(String make, String model) {
            this.make = make;
            this.model = model;
        }

        public Builder numberOfDoors(int doors){
            this.doors = doors;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder colour(String colour){
            this.colour = colour;
            return this;
        }

        public Builder plateNumber(String plateNum){
            this.plateNum = plateNum;
            return this;
        }

        public Vehicle build(){
            return new Vehicle(this);
        }

    }

}
