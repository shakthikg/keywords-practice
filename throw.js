function checkPositive(number) {
    if (number < 0) {
        throw new Error('The number must be positive.'); 
    }
    return `${number} is positive.`;
}

try {
    console.log(checkPositive(5)); 
    console.log(checkPositive(-3));
} catch (error) {
    console.error(`Error: ${error.message}`);
}
