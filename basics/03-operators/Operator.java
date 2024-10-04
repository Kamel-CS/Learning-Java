public class Operator {
    public static void main(String[] args) {

        // post-increment
        int i = 5;
        System.out.println("Initial value of i: " + i);
        int r1 = i++;                                        
        System.out.println("After post-increment: r1 = " + r1 + " and i = " + i);


        // pre-increment
        int j = 8;
        System.out.println("Initial value of j: " + j);
        int r2 = j++;
        System.out.println("After pre-increment: r2 = " + r2 + " and j = " + j);
    }
}
