public class KeywordAssert
{
    public static void main(String[] args)
    {
        int age = 18;
        assert age >= 18: "Age is less than 18";

        int number = -5;
        assert number > 0: "Number is not positive";

        System.out.println("Program contiues....");
    }
}