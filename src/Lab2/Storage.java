package Lab2;

import java.util.LinkedList;
import java.util.Queue;

public class Storage {
    private Queue<Products> queue = new LinkedList();
    private int limit;
    private final Object lock = new Object();

    public Storage(int limit) {
        this.limit = limit;
    }

    public Queue<Products> getQueue() {
        return queue;
    }

    public void setQueue(Queue<Products> queue) {
        this.queue = queue;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public Object getLock() {
        return lock;
    }
}