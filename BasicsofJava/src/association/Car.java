package association;

public class Car {

	  // Car brand name
    private String brand;

    // Car price
    private double price;

    // HAS-A1 relationship (Composition)
    private Engine engine;
    private Tyre tyre;

    /*
     * Constructor
     * Creates Engine and Tyre objects when Car object is created
     */
    public Car() {
        engine = new Engine();
        tyre = new Tyre();
    }

    // Getter for car brand
    public String getBrand() {
        return brand;
    }

    // Setter for car brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for car price
    public double getPrice() {
        return price;
    }

    // Setter for car price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter for Engine object
    public Engine getEngine() {
        return engine;
    }

    // Getter for Tyre object
    public Tyre getTyre() {
        return tyre;
    }
}
