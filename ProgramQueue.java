import java.util.*;

public class ProgramQueue<E> {
    private Queue<E> queue;

    public ProgramQueue() {
        queue = new LinkedList<E>();
    }   

    public void enqueue(E data) {
        queue.add(data);
        System.out.println("Data " + data + " telah ditambahkan");
    }

    public E dequeue() throws NoSuchElementException {
        return queue.remove();
    }

    public void viewQueue() {
        System.out.println("Queue: ");
        for (E value : queue) {
            System.out.println(value);
        }
    }
}
