document
  .getElementById("loginForm")
  .addEventListener("submit", function (event) {
    event.preventDefault();

    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    // Basic validation
    if (email && password) {
      alert("Login successful! (This is a demo)");
      // Here you would typically send the data to a server
      console.log("Email:", email);
      console.log("Password:", password);
    } else {
      alert("Please fill in all fields");
    }
  });
