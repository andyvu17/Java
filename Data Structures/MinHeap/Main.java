package com.andyvu;


//minHeap test
public class Main {
    public static void main(String[] args) {
        MinHeap myMinHeap = new MinHeap(5);
        myMinHeap.add(-10);
        myMinHeap.add(7);
        myMinHeap.add(20);
        myMinHeap.add(15);
        myMinHeap.add(14);
        myMinHeap.add(1);
        myMinHeap.add(25);
        myMinHeap.add(35);
        myMinHeap.add(55);
        myMinHeap.add(5);
        myMinHeap.add(5);
        myMinHeap.print();

        myMinHeap.get();
        myMinHeap.print();
        myMinHeap.get();
        myMinHeap.print();
        myMinHeap.get();

    }
}
