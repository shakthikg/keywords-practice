abstract class Animal
{
    public abstract void Sound();
    public void sleep()
    {
        System.out.println("Animal Sleeping");
    }
}
class Dog extends Animal
{
    @Override
    public  void Sound()
    {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal
{
    @Override
    public void Sound()
    {
        System.out.println("Cat Meows");
    }
}
public class Abstractmain
{
    public static void main(String[] args)
    {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.Sound();
        myCat.Sound();
        myDog.sleep();
    }
}