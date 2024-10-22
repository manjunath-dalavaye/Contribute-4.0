// Function to add a task to the list
function addTask() {
  const taskInput = document.getElementById("new-task");
  const task = taskInput.value.trim();

  if (task) {
    // Create a new list item for the task
    const taskItem = document.createElement("li");
    taskItem.textContent = task;

    // Add the task to the list
    document.getElementById("task-list").appendChild(taskItem);

    // Clear the input field
    taskInput.value = "";
  } else {
    alert("Please enter a task.");
  }
}
