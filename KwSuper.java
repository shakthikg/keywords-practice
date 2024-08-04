class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void makeSound() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); 
    }
    @Override
    void makeSound() {
        super.makeSound(); 
        System.out.println(name + " barks.");
    }
}

public class KwSuper {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.makeSound();
    }
}
