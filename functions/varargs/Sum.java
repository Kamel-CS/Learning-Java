public class Sum {
    
    public static int sum(int... numbers) {
        int sum = 0;
        for (int number : numbers)
            sum += number;
        return sum;
    }

    // overloaded method
    public static int sum(String string, int... numbers) {
        System.out.print(string);
        return sum(numbers);
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5));

        // Multi-line formatted strin 
        String multilineString = """
            *******************
             OVERLOADED METHOD
            *******************
            """;

        System.out.println(sum(multilineString, 1, 2, 3, 4, 5));
    }
}
