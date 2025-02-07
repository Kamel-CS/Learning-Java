public class Random {
    public static void main (String[] args) {

        final int min = 1;
        final int max = 10;

        int randomNum = (int) (Math.random() * (max - min + 1)) + min;

        System.out.println("Random number between " + min + " and " + max + ": " + randomNum);
    }
}
