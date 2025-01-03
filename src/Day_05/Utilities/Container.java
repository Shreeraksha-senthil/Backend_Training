package Day_05.Utilities;

public class Container<T> {
    private T object;
    public Container(T object) {
        this.object = object;
    }
    public T getObject() {
        return object;
    }
    public void setObject(T object) {
        this.object = object;
    }
}