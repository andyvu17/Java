package com.andyvu;

import java.util.Arrays;

public class MinHeap {
    //minimum heap setup
    private int capacity;
    private int size = 0;
    private int [] array;

    //default constructor
    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.array = new int [capacity];
    }

    //Helper functions
    //get indexes
    private int getParentIndex(int i) {return (i-1) / 2;}
    private int getLeftIndex(int i) {return i * 2 + 1;}
    private int getRightIndex(int i) {return i * 2 + 2;}

    //get values
    private int getParentValue(int i) {return array[getParentIndex(i)];}
    private int getLeftValue(int i) {return array[getLeftIndex(i)];}
    private int getRightValue(int i) {return array[getRightIndex(i)];}

    //get if node exists
    private boolean parentExists(int i) {return i >= 0;}
    private boolean leftExists(int i) {return getLeftIndex(i) < size;}
    private boolean rightExists(int i) {return getRightIndex(i) < size;}

    //swap values
    private void swap(int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    //increase capacity
    private void checkCapacity() {
        if(this.capacity == this.size) {
            array = Arrays.copyOf(array, capacity * 2);
            capacity *= 2;
        }
    }

    //add value to heap
    public void add(int value) {
        checkCapacity(); //ensure there is enough room to store value
        array[size] = value;
        size++;
        heapifyUp(); //bubble value up the heap to correct position
    }

    //remove value from heap
    public int get() {
        //cannot remove a value if heap is empty
        if(size == 0) {
            System.out.println("Heap is empty");
        }

        int value = array[0]; //extract min value
        array[0] = array[size - 1]; //fill in empty space with last element in heap
        size--;
        if(size == 0) {
            System.out.println("Heap is now empty");
        }
        heapifyDown(); //bubble value down the heap to correct position
        return value;
    }

    //heapifyUp
    private void heapifyUp() {
        int index = size - 1;

        while(parentExists(index) && getParentValue(index) > array[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    //heapifyDown
    private void heapifyDown() {
        int index = 0;
        while(leftExists(index)) {
            int minimumValueIndex = getLeftIndex(index);
            if(rightExists(index) && getRightValue(index) < getLeftValue(index)) {
                minimumValueIndex = getRightIndex(index);
            }
            if(array[index] < array[minimumValueIndex]) {
                break;
            } else {
                swap(index, minimumValueIndex);
            }
            index = minimumValueIndex;
        }
    }

    public void print() {
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

