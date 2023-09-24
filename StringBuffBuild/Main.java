package StringBuffBuild;

public class Main {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder();
        stb.append("Hello World!");
        System.out.println(stb.reverse());
        stb.reverse();
        stb.deleteCharAt(1);
        System.out.println(stb);
        stb.delete(2, 4);
        System.out.println(stb);
        stb.insert(1, "e");
        System.out.println(stb);
        stb.insert(3, "l");
        stb.insert(4, "o");
        System.out.println(stb);
        System.out.println(stb.capacity());
        stb.setCharAt(4, 'c');
        System.out.println(stb);
        stb.deleteCharAt(4);
        System.out.println(stb);
        String s = stb.substring(0, 3);
        System.out.println(s);
        System.out.println(stb);
        
        StringBuffer stbuff = new StringBuffer("Hello There");
        System.out.println(stbuff);
        // StringBuffer is thread safe whereas StringBuilder is not
        // StringBuilder is faster and preferred over StringBuilder in single-thread programs
        
        String string = "Hello";
        StringBuilder stringBuilder = new StringBuilder("Another Hello");
        stringBuilder.append(string);
        System.out.println(stringBuilder);
        string += stringBuilder.toString();
        System.out.println(string);




    }
}
