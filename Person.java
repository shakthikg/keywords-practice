class Person {
    private final String name;
    private final int age;
    public Person(String name, int age) {
        this.name = name; 
        this.age = age;  
    }
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        // Displaying the person's details
        person.display();

        // Getting the current instance using 'this'
        Person samePerson = person.getPerson();
        System.out.println("Same Person: " + samePerson.name + ", " + samePerson.age);
    }
}
