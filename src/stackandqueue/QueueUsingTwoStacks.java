package stackandqueue;
import java.util.Stack;

/*
 * QueueUsingTwoStacks
 * -------------------
 * Implement a queue using two stacks.
 * Approach: Use one stack for enqueue, another for dequeue.
 * Dequeue transfers elements from enqueue stack only when needed.
 */

public class QueueUsingTwoStacks<T> {
    private Stack<T> stackEnqueue = new Stack<>();
    private Stack<T> stackDequeue = new Stack<>();

    public void enqueue(T value) {
        stackEnqueue.push(value);
    }

    public T dequeue() {
        if (stackDequeue.isEmpty()) {
            while (!stackEnqueue.isEmpty()) {
                stackDequeue.push(stackEnqueue.pop());
            }
        }
        if (stackDequeue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return stackDequeue.pop();
    }

    public boolean isEmpty() {
        return stackEnqueue.isEmpty() && stackDequeue.isEmpty();
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks<Integer> queue = new QueueUsingTwoStacks<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // 1
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // 2
        System.out.println(queue.dequeue()); // 3
        System.out.println(queue.dequeue()); // 4
    }
}
