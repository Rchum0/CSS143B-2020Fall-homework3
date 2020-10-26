package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variable
    private LinkedList<T> data;
    private Node<T> top;

    private class Node<T> {

        private LinkedList<T> data;
        private Node<T> next;

        Node(T element) {
            data = (LinkedList<T>) element;
        }
    }

    public LinkedListStack() {
        // homework
        top = null;
        //data = new LinkedList<T>();
    }

    @Override
    public boolean push(T val) {
        // homework
        Node<T> newItem = new Node<T>(val);
        if (top == null) {
            top = newItem;
        } else {
            newItem.next = top;
            top = newItem;
        }
        return true;
    }


    @Override
    public T pop() {
        // homework
        if (top == null) {
            System.out.println("Stack is empty");
        }
        T val = (T) top.data;
        top = top.next;
        return val;
    }

    @Override
    public T peek() {
        // homework
        if(top == null){
            System.out.println("Empty stack");
        }
        T val = (T) top.data;
        return val;   // place holder
    }

    @Override
    public int size() {
        return data.size();
    }
}
