interface Animal {
    void eat(); 
    void sleep();
}
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }

    public void bark() {
        System.out.println("The dog is barking.");
    }
}
public class KwImpInt {
    public static void main(String[] args) {
        Dog myDog = new Dog(); 
        myDog.eat(); 
        myDog.sleep(); 
        myDog.bark(); 
    }
}
