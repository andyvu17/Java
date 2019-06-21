package com.Andyvu;
// [ 3, 5, 2, 6, 8, 1]

// [5 , 6, 8, 1, 2, 3]

public class mergeSort {
    public static void main(String[] args) {
        int [] array = {4, 2, 1, 3};
        mergeSort(array);
        for(int i: array) {
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int [] array) {
        int [] helper = new int [array.length];
        mergeSort(array, helper, 0, array.length-1);
    }

    public static void mergeSort(int [] array, int[] helper, int low, int high) {
        //base case
        if(low < high) {
            //find midpoint
            int middle = (low + high) / 2;

            //sort left side
            mergeSort(array, helper, low, middle);

            //sort right side
            mergeSort(array, helper, middle + 1, high);

            //merge two sides together
            merge(array, helper, low, middle, high);
        }
    }

    public static void merge(int [] array , int [] helper, int low, int middle, int high) {
        //fill helper with array contents
        for(int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        //set to first position of left subarray
        int i = low;
        //set to first position of right subarray
        int j = middle + 1;
        //set to first position of original array holding sorted elements
        int k = low;

        //sort elements
        while(i <= middle && j <= high) {
            if(helper[i] <= helper[j]) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }

        //fill in rest of left array
        while(i <= middle) {
            array[k] = helper[i];
            k++;
            i++;
        }
    }

}
