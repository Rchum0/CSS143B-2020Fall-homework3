package Problem1;

public class MinStack extends ArrayStack<Integer> {
    // okay to add member variables
    // can only use Stack interface and ArrayStack from this folder
    // do not use Java Stack

    // ArrayStack auxStack = new ArrayStack(size);

    public MinStack(int size) {
        super(size);

    }

    @Override
    public boolean push(Integer val) {
        super.push(val);
        //push to auxStack too

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
        //pop from auxStack
        return super.pop; // place holder
    }

    public Integer getMin() {
        // homework
        return auxStack.peek();

    }

}

