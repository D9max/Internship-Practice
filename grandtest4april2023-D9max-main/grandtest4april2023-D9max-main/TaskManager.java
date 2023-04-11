/*You are creating a program to keep track of a list of tasks for a project. Each task has a unique ID, a name, a description, a due date, and a status (e.g. "in progress", "completed", "overdue"). You decide to use a HashSet to store the task IDs, and you need to implement some functionality for adding and removing tasks from the list, as well as updating the status of a task. Write a Java program that implements the following: 

1. Add Task 

2. Remove Task 

3. Update status of Task 

4. Display all the Tasks 

5. Display "in progress" Tasks 

6. Display "completed" tasks 

7. Display "overdue" tasks */

import java.util.*;

public class TaskManager {
    private HashSet<Integer> taskIds;
    private HashMap<Integer, Task> tasks;
    
    public TaskManager() {
        taskIds = new HashSet<Integer>();
        tasks = new HashMap<Integer, Task>();
    }
    
    public void addTask(int id, String name, String description, Date dueDate) {
        if (!taskIds.contains(id)) {
            Task task = new Task(id, name, description, dueDate);
            taskIds.add(id);
            tasks.put(id, task);
            System.out.println("Task with ID " + id + " added successfully.");
        } else {
            System.out.println("Task with ID " + id + " already exists.");
        }
    }
    
    public void removeTask(int id) {
        if (taskIds.contains(id)) {
            taskIds.remove(id);
            tasks.remove(id);
            System.out.println("Task with ID " + id + " removed successfully.");
        } else {
            System.out.println("Task with ID " + id + " does not exist.");
        }
    }
    
    public void updateTaskStatus(int id, String status) {
        if (taskIds.contains(id)) {
            Task task = tasks.get(id);
            task.setStatus(status);
            System.out.println("Status of task with ID " + id + " updated to " + status + ".");
        } else {
            System.out.println("Task with ID " + id + " does not exist.");
        }
    }
    
    public void displayAllTasks() {
        System.out.println("All Tasks:");
        for (Task task : tasks.values()) {
            System.out.println(task.toString());
        }
    }
    
    public void displayInProgressTasks() {
        System.out.println("Tasks in progress:");
        for (Task task : tasks.values()) {
            if (task.getStatus().equals("in progress")) {
                System.out.println(task.toString());
            }
        }
    }
    
    public void displayCompletedTasks() {
        System.out.println("Completed tasks:");
        for (Task task : tasks.values()) {
            if (task.getStatus().equals("completed")) {
                System.out.println(task.toString());
            }
        }
    }
    
    public void displayOverdueTasks() {
        System.out.println("Overdue tasks:");
        Date today = new Date();
        for (Task task : tasks.values()) {
            if (task.getDueDate().before(today) && !task.getStatus().equals("completed")) {
                System.out.println(task.toString());
            }
        }
    }
}

