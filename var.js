var greeting = 'Hello, world!';
function displayGreeting() {
    var name = 'Alice';
    console.log(greeting + ' My name is ' + name + '.');
}

displayGreeting(); 
console.log(hoistedVar); 
var hoistedVar = 'This variable is hoisted.';

if (true) {
    var blockScopedVar = 'I am block scoped using var.';
}
console.log(blockScopedVar); 