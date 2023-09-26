package Collections.VectorDS;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Double> vector = new Vector<>();
        for(double i=0;i<11;i++){
            vector.add(i);
        }
        System.out.println(vector);
    }
}
