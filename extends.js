class Animal {
    constructor(name) {
        this.name = name;
    }

    speak() {
        console.log(`${this.name} makes a noise.`);
    }
}

class Dog extends Animal {
    constructor(name, breed) {
        super(name); 
        this.breed = breed;
    }

    speak() {
        console.log(`${this.name} barks.`);
    }

    getBreed() {
        return this.breed;
    }
}

const myDog = new Dog('Rex', 'German Shepherd');

myDog.speak();     
console.log(myDog.getBreed()); 