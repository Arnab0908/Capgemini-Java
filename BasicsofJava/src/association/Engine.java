package association;


/*
 * Engine class represents the Engine of a Car
 */
public class Engine {

    // Engine capacity in CC
    private int cc;

    // Type of engine (Petrol / Diesel / Electric)
    private String type;

    // Getter for cc
    public int getCc() {
        return cc;
    }

    // Setter for cc
    public void setCc(int cc) {
        this.cc = cc;
    }

    // Getter for engine type
    public String getType() {
        return type;
    }

    // Setter for engine type
    public void setType(String type) {
        this.type = type;
    }
}