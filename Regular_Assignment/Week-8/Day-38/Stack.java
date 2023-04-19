import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {
    private List<T> stackList;

    public Stack() {
        stackList = new ArrayList<T>();
    }

    public void push(T item) {
        stackList.add(item);
    }

    public T pop() {
        if (stackList.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.remove(stackList.size() - 1);
    }

    public T peek() {
        if (stackList.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackList.get(stackList.size() - 1);
    }

    public boolean isEmpty() {
        return stackList.isEmpty();
    }
}
