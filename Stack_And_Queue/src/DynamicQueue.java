public class DynamicQueue extends CircularQueue{
    public DynamicQueue(){
        super();
    }
    public DynamicQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int item) {

        if(this.isFull()){
            int newArr[] = new int[data.length*2]; // Create New Array Of Double Size.

            for(int i=0;i<data.length;i++)
                newArr[i] = data[(front+i) % data.length];    // Now , Copies All Elements Into New Array.
            front = 0;
            end = data.length;
            data = newArr;
        }

        return super.insert(item);
    }
}
