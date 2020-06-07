package com.linklist;

public class LinkList {
    private Node head;

    public LinkList(){

    }

    public LinkList(Node head) {
        this.head=head;
    }

    public void addNode(Node newNode){
        if(this.head == null){
            this.head = newNode;
            return;
        }
        Node nextNode= head.getNext();
        Node currentNode = head;
        while (nextNode != null){
            currentNode = nextNode;
            nextNode=nextNode.getNext();
        }
        currentNode.setNext(newNode);
    }

    public void print(){
        if(this.head != null){
            Node nextNode = head;
            while (nextNode != null){
                System.out.println(" -> "+nextNode.getValue());
                nextNode=nextNode.getNext();
            }
        }
    }

    public LinkList reversedList(){
        Node reversed = this.head.reversed();
        return new LinkList(reversed);
    }
    @Override
    public String toString() {
        return "LinkList{" +
                "head=" + head +
                '}';
    }
}
