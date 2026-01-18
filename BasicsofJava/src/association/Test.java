package association;

/*
 * Test class to demonstrate HAS-A relationship
 */
public class Test {

    public static void main(String[] args) {

        // Creating Car object
        Car car = new Car();

        // Setting Car details
        car.setBrand("BMW");
        car.setPrice(5500000);

        // Setting Engine details using Car object
        car.getEngine().setCc(2000);
        car.getEngine().setType("Petrol");

        // Setting Tyre details using Car object
        car.getTyre().setBrand("MRF");
        car.getTyre().setSize(18);

        // Displaying details
        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car Price: " + car.getPrice());
        System.out.println("Engine CC: " + car.getEngine().getCc());
        System.out.println("Engine Type: " + car.getEngine().getType());
        System.out.println("Tyre Brand: " + car.getTyre().getBrand());
        System.out.println("Tyre Size: " + car.getTyre().getSize());
    }
}
