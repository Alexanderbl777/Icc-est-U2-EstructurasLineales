package models;

public class NodeGeneric <T> {//Datos genericos 

    private  T value;
    private NodeGeneric<T> next;
    
    public NodeGeneric(T value){
        this.next = null;
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public NodeGeneric<T> getNext() {
        return next;
    }
    public void setNext(NodeGeneric<T> next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return "NodeGeneric [value=" + value + ", next=" + next + "]";
    }

    

}
