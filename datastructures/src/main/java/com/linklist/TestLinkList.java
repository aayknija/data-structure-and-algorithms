package com.linklist;

public class TestLinkList {
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.addNode(new Node(5));
        linkList.addNode(new Node(6));
        linkList.addNode(new Node(7));
        linkList.addNode(new Node(8));
        linkList.print();
        System.out.println(" Printing reversed list");
        LinkList reversedList = linkList.reversedList();
        reversedList.print();


    }
}
