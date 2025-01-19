import java.util.ArrayList;

public class Main {

    public static void main(String[] main) {

        // String[] friendsArray = {"Kamel", "Mokhtar", "Abdou"};
        // String[] friendsArray = new String[] {"Kamel", "Mokhtar", "Abdou"};
        // String[] friendsArray = new String[3];

        // Arrays holds primitives or objects 


        ArrayList<String> friendsArrayList = new ArrayList<String>();

        // ArrayList can hold objects only but supports wrapper types for primitives (Integer, Boolean, Float, Double)
        
        // [0][1][2]...[N-1]
        friendsArrayList.add("Kamel");      // add element to the end
        friendsArrayList.add("Mokhtar");
        friendsArrayList.add("Abdou");

        for (int i = 0; i < friendsArrayList.size(); i++)   // for arrays it's .lenght
            System.out.println(friendsArrayList.get(i));

        System.out.println("\n");

        // or using a for each loop
        for (String friend: friendsArrayList)
            System.out.println(friend);

        friendsArrayList.set(2, "Abderaheman");     // change element at index 2
        
        friendsArrayList.add("Random");

        System.out.println("\n" + friendsArrayList);

        friendsArrayList.remove(3);                 // by index
        // friendsArrayList.remove("Random");       or by value

        System.out.println("\n" + friendsArrayList);
    }

}
