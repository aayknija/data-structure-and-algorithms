package com.linklist;

public class Node {
    private int value;
    private Node next;
    public Node(int value) {
        this.value = value;
    }

    public Node(Node nextNode) {
        this.setValue(nextNode.getValue());
        this.setNext(nextNode.getNext());
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node reversed(){
        Node root = new Node(this);
        root.setNext(null);
        Node nextNode= this.getNext();
        while (nextNode != null){
            root=addAtHead(root,nextNode);
            nextNode=nextNode.getNext();
        }

        return root;
    }

    private Node addAtHead(Node root, Node nextNode) {
        Node newNode = new Node(nextNode);
        newNode.setNext(root);
        return newNode;
    }
}
