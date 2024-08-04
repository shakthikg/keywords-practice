class Animal {
    constructor(name) {
        this.name = name;
    }
}

class Dog extends Animal {
    constructor(name, breed) {
        super(name); 
        this.breed = breed;
    }
}

const myDog = new Dog('Rex', 'German Shepherd');
const myAnimal = new Animal('Simba');

console.log(myDog instanceof Dog);      
console.log(myDog instanceof Animal);   
console.log(myAnimal instanceof Dog);   
console.log(myAnimal instanceof Animal); 
console.log(myDog instanceof Object);   
console.log(myAnimal instanceof Object); 
