package com.Andyvu;
//Hacker rank Jumping on the clouds challenge

import java.util.Scanner;

public class CloudJump {
    static int jumpingOnClouds(int[] c) {
        // int count = 0;
        // for (int i = 0; i < c.length - 1; i++,count++) {
        //     if (i < c.length-2 && c[i+2] == 0) {
        //       i++;
        //     }
        // }
        // return count;

        int count = 0, current = 0;
        while(current < c.length - 1) {
            if((current < c.length - 2) && (c[current + 2] == 0)) {
                current+=2;
            } else {
                current += 1;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] c = {0, 0, 1, 0, 0, 1, 0};
        System.out.println(jumpingOnClouds(c) + " jumps needed");

        int [] a = {0, 0, 1, 0, 0, 1, 0, 0};
        System.out.println(jumpingOnClouds(a) + " jumps needed");
    }
}
