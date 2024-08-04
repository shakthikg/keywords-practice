public class KwStrictfp {

    public float add(float a, float b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        KwStrictfp example = new KwStrictfp();
        float sum = example.add(1.1f, 2.2f);
        System.out.println("Sum: " + sum);
        int product = example.multiply(2, 3);
        System.out.println("Product: " + product);
    }
}
