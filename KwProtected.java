public class KwProtected {

    protected static class Animal {
        protected String name;

        protected Animal(String name) {
            this.name = name;
        }

        protected void makeSound() {
            System.out.println(name + " makes a sound.");
        }
    }

    public static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        public void bark() {
            makeSound();
            System.out.println(name + " barks.");
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.bark();
    }
}
