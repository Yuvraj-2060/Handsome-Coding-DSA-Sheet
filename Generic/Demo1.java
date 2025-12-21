package Generic;

// Without Generic
public class Demo1 {
    Object container;
    public Demo1(Object container){
        this.container=container;
    }

    public Object getvalue(){
        return this.container;
    }
}
