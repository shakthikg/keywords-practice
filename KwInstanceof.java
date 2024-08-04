class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks");
    }
}
public class KwInstanceof {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); 
        Animal myDog = new Dog(); 

        if (myAnimal instanceof Animal) {
            System.out.println("myAnimal is an instance of Animal");
        }

        if (myDog instanceof Animal) {
            System.out.println("myDog is an instance of Animal");
        }

        if (myDog instanceof Dog) {
            System.out.println("myDog is an instance of Dog");
        }

        if (myAnimal instanceof Dog) {
            System.out.println("myAnimal is an instance of Dog");
        } else {
            System.out.println("myAnimal is NOT an instance of Dog");
        }
    }
}
