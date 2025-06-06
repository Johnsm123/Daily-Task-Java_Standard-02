function generateEmployeeProfile(name, jobTitle = "Associate") {
  if (!name) {
    console.log("Name is required to generate an employee profile.");
    return;
  }

  const profile = {
    name: name,
    title: jobTitle,
  };
  console.log("Employee Profile:", profile);
  return profile;
}

generateEmployeeProfile("Alice", "Software Engineer"); // With title
generateEmployeeProfile("Bob");
