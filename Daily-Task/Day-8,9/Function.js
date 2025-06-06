function calculator(a, b, operation) {
  switch (operation) {
    case "add":
      return a + b;
    case "subtract":
      return a - b;
    case "multiply":
      return a * b;
    case "divide":
      if (b !== 0) {
        return a / b;
      } else {
        return "Error: Division by zero";
      }
    default:
      return "Error: Invalid operation";
  }
}

console.log(calculator(10, 5, "add")); // Output: 15
console.log(calculator(10, 5, "subtract")); // Output: 5
console.log(calculator(10, 5, "multiply")); // Output: 50
console.log(calculator(10, 5, "divide")); // Output: 2
console.log(calculator(10, 0, "divide"));
