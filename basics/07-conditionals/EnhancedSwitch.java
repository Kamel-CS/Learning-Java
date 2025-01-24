public class EnhancedSwitch {
    public static void main(String[] args) {
        int day = 5;

        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> {
                System.out.println("Enjoy the weekend!");
                yield "Weekend";
            }
            default -> "Invalid day";
        };

        System.out.println("Day type: " + dayType);
    }
}
