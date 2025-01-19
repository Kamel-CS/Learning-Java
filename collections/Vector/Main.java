import java.util.Vector;

public class Main {
    
    public static void main(String[] args) {
        Vector<String> names = new Vector<>();

        names.add("Kamel");
        names.add("Demri");

        names.remove(1);
        names.set(0, "Hehe");

        for (String name: names)
            System.out.println(name);
    }
}
