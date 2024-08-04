public class KwReturn {
    public int add(int a, int b) {
        int sum = a + b;
        return sum; 
    }

    public static void main(String[] args) {
        KwReturn example = new KwReturn();

        int result = example.add(5, 3);
        System.out.println("Sum: " + result); 

    }
}
