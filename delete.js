let person = {
    name: "Alice",
    age: 30,
    city: "New York"
};

console.log("Before deletion:", person);

delete person.age;

console.log("After deletion:", person);
