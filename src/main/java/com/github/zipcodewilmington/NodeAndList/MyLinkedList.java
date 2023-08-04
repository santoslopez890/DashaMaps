package com.github.zipcodewilmington.NodeAndList;

import java.util.Objects;

public class MyLinkedList {
    MyNode head;


    public MyNode getHead() {
        return head;
    }

    public void setHead(MyNode head) {
        this.head = head;
    }

    public MyLinkedList(){
        head=new MyNode(null,null);
    }
    public void add(String key,Integer value){
        MyNode currentNode=head;
        while (currentNode.getNext()!=null){
            currentNode=currentNode.getNext();
        }
        currentNode.setNext(new MyNode(key,value));
    }
    public Integer size(){
        Integer counter = 0;
        MyNode currentNode=head;
        while (currentNode.getNext()!=null){
            currentNode=currentNode.getNext();
            counter++;
        }
        return counter;
    }
    public boolean isEmpty(){
        return this.head.getNext()==null;
    }
    public MyNode get(String key){
        MyNode currentNode=head;
        while (currentNode!=null){
            currentNode=currentNode.getNext();
            if(Objects.equals(currentNode.getData().getKey(), key)){
                return currentNode;
            }
        }
        return null;
    }
    public Integer remove(String key){
        MyNode currentNode=head.getNext();
        MyNode previousNode=head;
        while (currentNode!=null && !currentNode.getData().getKey().equals(key)){
            previousNode=currentNode;
           currentNode=currentNode.getNext();
        }

        previousNode.setNext(currentNode.getNext( ));


        return null;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyLinkedList that = (MyLinkedList) o;
        return Objects.equals(head, that.head);
    }

}
