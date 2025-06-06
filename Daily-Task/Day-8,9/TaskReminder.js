function setTaskReminder(taskId, reminderTime) {
  if (!taskId || !reminderTime) {
    console.log("Task ID and reminder time are required.");
    return;
  }
  // This function sets a reminder for a specific task
  console.log(`Reminder set for task ${taskId} at ${reminderTime}`);
}

setTaskReminder("Submit project report", "2025-06-10");
