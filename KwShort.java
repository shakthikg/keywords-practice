public class KwShort {
    public short add(short a, short b) {
        short sum = (short) (a + b); 
        return sum; 
    }
    public short doubleValue(short number) {
        return (short) (number * 2); 
    }

    public static void main(String[] args) {
        KwShort example;
        example = new KwShort();
        short num1 = 10;
        short num2 = 20;
        short result = example.add(num1, num2);
        System.out.println("Sum: " + result);
        short doubled = example.doubleValue(num1);
        System.out.println("Doubled value: " + doubled);
    }
}
