let number = -5;

if (number > 0) {
  console.log("The number is positive.");
} else if (number < 0) {
  console.log("The number is negative.");
} else {
  console.log("The number is zero.");
}

let num1 = 10;
let num2 = 20;

if (num1 > num2) {
  console.log(num1 + " is greater than " + num2 + ".");
} else if (num1 < num2) {
  console.log(num1 + " is less than " + num2 + ".");
} else {
  console.log(num1 + " is equal to " + num2 + ".");
}

let num3 = 15;
let num4 = 4;

let addition = num3 + num4;
let subtraction = num3 - num4;
let multiplication = num3 * num4;
let division = num3 / num4;
let modulus = num3 % num4;

console.log("Addition: " + addition);
console.log("Subtraction: " + subtraction);
console.log("Multiplication: " + multiplication);
console.log("Division: " + division);
console.log("Modulus: " + modulus);

for (let i = 1; i <= 100; i++) {
  if (i % 15 === 0) console.log("FizzBuzz");
  else if (i % 3 === 0) console.log("Fizz");
  else if (i % 5 === 0) console.log("Buzz");
  else console.log(i);
}

function factorial(n) {
  if (n === 0 || n === 1) return 1;
  return n * factorial(n - 1);
}

// Example
console.log(factorial(5)); // Output: 120

function isPalindrome(str) {
  const cleaned = str.toLowerCase().replace(/[^a-z0-9]/g, "");
  return cleaned === cleaned.split("").reverse().join("");
}

// Example
console.log(isPalindrome("Racecar")); // Output: true

function sortArray(arr) {
  for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      if (arr[i] > arr[j]) {
        [arr[i], arr[j]] = [arr[j], arr[i]]; // Swap
      }
    }
  }
  return arr;
}

// Example
console.log(sortArray([3, 1, 4, 1, 5, 9, 2]));

function findMinMax(arr) {
  let min = arr[0],
    max = arr[0];
  for (let num of arr) {
    if (num < min) min = num;
    if (num > max) max = num;
  }
  console.log("Largest:", max);
  console.log("Smallest:", min);
}

// Example
findMinMax([7, 2, 10, 4, 8]);

function simpleCalculator() {
  const num1 = parseFloat(prompt("Enter the first number:"));
  const num2 = parseFloat(prompt("Enter the second number:"));
  const operation = prompt("Enter operation (+, -, *, /):");

  let result;

  switch (operation) {
    case "+":
      result = num1 + num2;
      break;
    case "-":
      result = num1 - num2;
      break;
    case "*":
      result = num1 * num2;
      break;
    case "/":
      if (num2 !== 0) {
        result = num1 / num2;
      } else {
        result = "Error: Division by zero.";
      }
      break;
    default:
      result = "Invalid operation.";
  }

  alert("Result: " + result);
}

// Example usage:
simpleCalculator();
