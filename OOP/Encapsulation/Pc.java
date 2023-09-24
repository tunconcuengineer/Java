package OOP.Encapsulation;

public class Pc {
    private int id;
    private String model;
    private double screenSize;
    private double price;

    public Pc(int id, String model, double screenSize, double price) {
        this.id = id;
        this.model = model;
        this.screenSize = screenSize;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pc [id=" + id + ", model=" + model + ", screenSize=" + screenSize + ", price=" + price + "]";
    }

    

    

    
}
