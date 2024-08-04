public class KwNew {

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }

        void displayName() {
            System.out.println("Name: " + name);
        }
    }

    public static void main(String[] args) {

        Person person1 = new Person("Alice");

        person1.displayName();
        
        Person person2 = new Person("Bob");
        
        person2.displayName();
    }
}
