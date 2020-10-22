package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {

    }

    public ArrayStack(int capacity) {
        if (capacity > 0) {
            this.size = 0;
            data = (T[]) new Object[capacity];
        }

    }

    @Override
    public boolean push(T val) {
        /*
        System.out.println("Made it to push");
        System.out.println("This is the size:" + size);
        System.out.println("This is the length" + data.length);

         */
        if (this.size == data.length) {
            return false;
        } else {
            data[size++] = val;
            return true;
        }
    }

    //Remove the top element of the stack
    @Override
    public T pop() {
        /*
        System.out.println("Made it to pop");
        System.out.println("This is the size:" + size);
        System.out.println("This is the length" + data.length);
         */
        if (size <= 0) {
            return null;
        }
        T val = data[--size];
        data[size] = null;
        return val;
    }

    @Override
    public T peek() {
        return data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

}
