// To-Do List Array
let todoList = [];

// 1. Add a new task
function addTask(taskName) {
  todoList.push({ task: taskName, status: "pending" });
  console.log(`Task "${taskName}" added.`);
}

// 2. Mark a task as completed
function completeTask(taskName) {
  const task = todoList.find((item) => item.task === taskName);
  if (task) {
    task.status = "completed";
    console.log(`Task "${taskName}" marked as completed.`);
  } else {
    console.log(`Task "${taskName}" not found.`);
  }
}

// 3. Display all tasks
function displayTasks() {
  console.log("To-Do List:");
  todoList.forEach((item, index) => {
    console.log(`${index + 1}. ${item.task} - ${item.status}`);
  });
}

// Example usage:
addTask("Buy groceries");
addTask("Do homework");
completeTask("Buy groceries");
displayTasks();
