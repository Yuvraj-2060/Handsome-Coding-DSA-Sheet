public class DynamicStack extends CustomStack{

    public DynamicStack() {
        super();    // It will call CustomStack() constructor
    }
    public DynamicStack(int size) {
        super(size);    // It will call CustomStack(int size) constructor
    }

    @Override
    public boolean push(int item) throws StackException {
        if(this.isFull()){
            int newArr[] = new int[data.length*2]; // Create New Array Of Double Size.

            for(int i=0;i<data.length;i++)
                newArr[i] = data[i];    // Now , Copies All Elements Into New Array.
            data = newArr;
        }
        // At this point we know array "data" is no more full
        // Therefore we can do normal push operation now.
        return super.push(item);
    }
}
