package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class SumOfElementBetweenKthSmallestK2smallest {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            maxHeap.add(arr[i]);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }

    public static int sumBetweenKthSmallest(int[] arr, int k1, int k2) {
        int smallest1 = kthSmallest(arr, k1);
        int smallest2 = kthSmallest(arr, k2);
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallest1 && arr[i] < smallest2) {
                sum += arr[i];
            }
        }

        return sum;
    }
    //tc=nlogk

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 11, 12, 15};
        int k1 = 3;
        int k2 = 6;
        int sum = sumBetweenKthSmallest(arr, k1, k2);
        System.out.println("Sum of elements between " + k1 + "-th smallest and " + k2 + "-th smallest: " + sum);
    }
}

