import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 56789);

        System.out.println(empIds);

        System.out.println(empIds.get("Carl"));
    }
}
