function generateEmail(name, department, date) {
  if (!name || !department || !date) {
    return "Error: Missing required employee information.";
  }

  const message = `Dear ${name},\n\nWelcome to the ${department} team! Your joining date is ${date}.`;
  return message;
}

// Example usage:
const email = generateEmail("John Samuel", "Engineering", "June 10, 2025");
console.log(email);
