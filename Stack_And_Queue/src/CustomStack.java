public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr =-1;

    public CustomStack(int size) {
        this.data = new int[size];
    }
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public boolean push(int item)throws StackException{
        if(isFull()){
            throw new StackException("Stack Is Full Can not Add Further");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop()throws StackException{
        if(isEmpty())
            throw new StackException("Cannot POP Any Further Since Stack Is Empty Now ..!!");

        return data[ptr--];
    }

    public int peek() throws StackException{
        if(isEmpty())
            throw new StackException("Cannot Peek From An Empty Stack..!");
        return data[ptr];
    }
    public boolean isFull() {
        return ptr == data.length-1;
    }
    public boolean isEmpty() {
        return ptr == -1;
    }

}
