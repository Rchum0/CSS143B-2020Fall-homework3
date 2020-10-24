package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack

    private ArrayStack minimums;
    private int tempMin;

    public MinStack(int size) {
        super(size);
        minimums = new ArrayStack(size);
    }

    @Override
    public boolean push(Integer val) {
        if(minimums.size() < 0) {
            return false;
        }
        if(val < tempMin){
            tempMin = val;
        }
            tempMin = val;
            minimums.push(val);
            System.out.println("Number inserted: " + val);

            return true; // place holder
    }

    @Override
    public Integer pop() {
        // homework
        return -1; // place holder
    }

    public Integer getMin() {
        // homework
        return tempMin;

    }

}

