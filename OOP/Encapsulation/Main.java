package OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Pc pc = new Pc(1, "Dell", 17.5, 10500);
        Pc pc1 = new Pc(2, "Lenovo", 16, 9750);
        Pc pc2 = new Pc(3, "Mac", 15, 15000);
        Pc pc3 = new Pc(4, "Asus", 12.5, 7700);
        System.out.println(pc.toString());
        pc.setId(5);
        pc.setModel("Monster");
        pc.setScreenSize(20);
        pc.setPrice(22500);
        System.out.println(pc.toString());
        System.out.println(pc.getId());
        System.out.println(pc.getModel());
        System.out.println(pc.getScreenSize());
        System.out.println(pc.getPrice());
        System.out.println(pc1.toString());   
        System.out.println(pc2.toString());   
        System.out.println(pc3.toString());        
    }
}
