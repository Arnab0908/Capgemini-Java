package association;

/*
 * Tyre class represents Tyre details of a Car
 */
public class Tyre {

    // Tyre brand name
    private String brand;

    // Tyre size in inches
    private int size;

    // Getter for tyre brand
    public String getBrand() {
        return brand;
    }

    // Setter for tyre brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for tyre size
    public int getSize() {
        return size;
    }

    // Setter for tyre size
    public void setSize(int size) {
        this.size = size;
    }
}