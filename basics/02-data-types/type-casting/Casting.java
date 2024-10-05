public class Casting {
    public static void main(String[] args) {

        int a = 5;
        int b = 2;

        float result = a / b;
        System.out.println(a + "/" + b + " = " + result);

        result = (float) a / b;
        System.out.println(a + "/" + b + " = " + result);
    }
}
