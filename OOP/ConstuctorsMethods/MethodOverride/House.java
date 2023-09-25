package OOP.ConstuctorsMethods.MethodOverride;

public class House {
    private int floors;
    private int windows;

    

    public House(int floors, int windows) {
        this.floors = floors;
        this.windows = windows;
    }
    



    public int getFloors() {
        return floors;
    }




    public void setFloors(int floors) {
        this.floors = floors;
    }




    public int getWindows() {
        return windows;
    }




    public void setWindows(int windows) {
        this.windows = windows;
    }




    @Override
    public String toString() {
        return "House [floors=" + floors + ", windows=" + windows + "]";
    }

    



    

    


    
}
