package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int size){
        data = (T[]) (new Stack[size]);
        this.size = 0;
    }

    //Add the value to the top of my stack
    @Override
    public boolean push(T val) {
        if(size == data.length){
            return false;
        }else {
            data[size] = val;
            size++;
            return true;
        }
    }

    @Override
    public T pop() {
        T val = data[size - 1];

        return val;   // place holder
    }

    @Override
    public T peek() {

        T val = null;   // place holder
        return val;   // place holder
    }

    @Override
    public int size() {
        return size;
    }
}
