public class KwFinally {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println("Accessing element 2: " + numbers[2]);
            System.out.println("Accessing element 10: " + numbers[10]); 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
