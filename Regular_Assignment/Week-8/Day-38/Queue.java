import java.util.LinkedList;
import java.util.Queue;

public class Queue<T> {
    private Queue<T> queue;

    public Queue() {
        queue = new LinkedList<T>();
    }

    public void enqueue(T item) {
        queue.add(item);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.remove();
    }

    public T peek() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
