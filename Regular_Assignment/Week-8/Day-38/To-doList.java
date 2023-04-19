import java.util.LinkedList;

public class ToDoList {
    private LinkedList<String> tasks;

    public ToDoList() {
        tasks = new LinkedList<String>();
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public void editTask(int index, String newTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newTask);
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }

    public void markTaskAsComplete(int index) {
        if (index >= 0 && index < tasks.size()) {
            String task = tasks.get(index);
            tasks.set(index, "[x] " + task);
        }
    }

    public void displayIncompleteTasks() {
        System.out.println("Incomplete tasks:");
        for (int i = 0; i < tasks.size(); i++) {
            String task = tasks.get(i);
            if (!task.startsWith("[x] ")) {
                System.out.println((i+1) + ". " + task);
            }
        }
    }
}
