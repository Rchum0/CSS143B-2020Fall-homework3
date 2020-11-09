package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variable
    private LinkedList<T> data;

    public LinkedListStack() {
        // homework
        data = new LinkedList<T>();
    }

    @Override
    public boolean push(T val) {
        // homework
       data.addFirst(val);
       return true;
    }


    @Override
    public T pop() {
        // homework
        return data.pollFirst();
    }

    @Override
    public T peek() {
        // homework
        return data.peek();
    }

    @Override
    public int size() {
        return data.size();
    }
}
