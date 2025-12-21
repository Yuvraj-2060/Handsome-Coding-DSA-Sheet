package Generic;

public class Demo2<T> {
    T container;

    public Demo2(T container){
        this.container=container;
    }

    public T getContainer() {
        return container;
    }
}
