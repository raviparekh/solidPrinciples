package Builder;

public class main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle.Builder("VW", "Golf")
                                     .numberOfDoors(5)
                                     .colour("Blue")
                                     .plateNumber("R4 VIP")
                                     .price(125.00)
                                     .build();
        System.out.println(vehicle);
    }
}
