function divide(a, b) {
    try {
        if (b === 0) {
            throw new Error("Cannot divide by zero.");
        }
        let result = a / b;
        console.log(`Result: ${result}`);
    } catch (error) {
        console.error(`Error: ${error.message}`);
    } finally {
        console.log("Execution completed.");
    }
}

divide(10, 2);  