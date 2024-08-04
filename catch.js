try {
    let result = riskyFunction(); 
    console.log(result);
} catch (error) {
    console.error("An error occurred:", error.message);
}

function riskyFunction() {
    throw new Error("Something went wrong!");
}
