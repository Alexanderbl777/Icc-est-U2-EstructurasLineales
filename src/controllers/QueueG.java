package controllers;

import java.util.EmptyStackException;

import models.NodeGeneric;

public class QueueG <T> {
    private NodeGeneric<T> primeroC; //head, first
    private NodeGeneric<T> ultimo;
    private int size;

    

    public QueueG() {
        this.primeroC= null;
        this.ultimo = null;
    }



    public void add(T value){
        NodeGeneric<T> newNode = new NodeGeneric<T>(value);
        if(isEmpty()){
            primeroC= newNode;
            ultimo = newNode;
        }else{
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }
    public T remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T aux = primeroC.getValue();
        primeroC = primeroC.getNext();
        size--;
        return aux;
        
    }

    public T peek(){
        if(isEmpty())
            throw new EmptyStackException();

        return primeroC.getValue();
       
    }
    public T findByName(String name){
        if(name==primeroC.getValue()){
            return primeroC.getValue();
        }else{
            return null;
        }
    }

    public T deleteByName(String name){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        T aux = primeroC.getValue();
        primeroC = primeroC.getNext();
        return aux;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return primeroC == null;
    }

    public void printStack() {
        NodeGeneric<T> aux = primeroC;
        NodeGeneric<T> aux2 = ultimo;
        while (aux != null) {
            System.out.print(aux.getValue() + "/");
            aux = aux.getNext();
        }
        System.out.println();
    }
}
