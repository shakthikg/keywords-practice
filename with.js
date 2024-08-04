const person = {
    name: 'Alice',
    age: 30,
    city: 'Wonderland'
};

with (person) {
    console.log('Name:', name); 
    console.log('Age:', age);   
    console.log('City:', city); 
}
