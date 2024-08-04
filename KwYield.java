public class KwYield {
    public static void main(String[] args) {
        int dayOfWeek = 3;       
        String dayName = switch (dayOfWeek) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> {
                yield "Wednesday";
            }
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid day";
        };
        
        System.out.println("Day of the week: " + dayName);
    }
}
