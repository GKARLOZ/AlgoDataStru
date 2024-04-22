package org.example;

public class BinarySearchTwo {

    public static int doBinary(int[] arr, int target) {

        if (arr.length == 0) {

            return -1;

        }

        int start = 0;
        int end = arr.length - 1;
        int mid = 0;

        while (start <= end) {

            mid = start + (end - start)/2;
            if (arr[mid] < target) {

                start = mid + 1;

            } else if(arr[mid] > target) {
                end = mid - 1;

            }else{

                break;
            }
        }
        return mid;


    }

}
