package controllers;

import java.util.EmptyStackException;

import models.Node;

public class Queue {
    private Node primeroC; //head, first
    private Node ultimo;
    private int size;

    

    public Queue() {
        this.primeroC= null;
        this.ultimo = null;
    }



    public void add(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            primeroC= newNode;
            ultimo = newNode;
        }else{
            ultimo.setNext(newNode);
            ultimo = newNode;
        }
        size++;
    }
    public int remove(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int aux = primeroC.getValue();
        primeroC = primeroC.getNext();
        size--;
        return aux;
        
    }

    public int peek(){
        if(isEmpty())
            throw new EmptyStackException();

        return primeroC.getValue();
       
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return primeroC == null;
    }
}
