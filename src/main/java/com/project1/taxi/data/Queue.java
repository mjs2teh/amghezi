package com.project1.taxi.data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
//import java.util.Queue;

public class Queue<E> {
    private ArrayList<E> queue;
    public Queue() {
        this.queue = new ArrayList<E>();
    }
    public void Enqueue(E object){
        queue.add(object);
    }
    public E Dequeue() {
        if (size()>0) {
            return queue.remove(0);
        }
        return null;
    }
    public int size() {
        return queue.size();
    }
    public void print() {
        for (E item : queue) {
            System.out.print(item+" ");
        }
        System.out.println();
    }
}
