public class KwBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                break; 
            }
            System.out.println("i: " + i);
        }

        System.out.println("Loop terminated.");

        int j = 0;
        while (j < 10) {
            if (j == 6) {
                break; 
            }
            System.out.println("j: " + j);
            j++;
        }

        System.out.println("Second loop terminated.");
    }
}
