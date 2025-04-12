package ex1;

import ex2.Test;

import java.util.Arrays;

public class Ex1_ArrayUnidimensional {
    public static void main(String[] args) {
        int[] v = {2,3,4};
        System.out.print(Arrays.toString(v));

        int[] arr = {1,2,3,4,5,6,7,8,9};

        for(int i : arr) {
            System.out.println(i);
        }
        System.out.print(Arrays.toString(arr));
        Test test = new Test();
    }
}
