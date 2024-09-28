//import java.util.*;
/*
 * IT-2660 - Lab 1
 * Student Name: Jose Lopez
 */

public class Main {
    public static void main(String[] args) {

        Lab1 lab = new Lab1();

        System.out.println(lab.increment(1));
        System.out.println();

        int[] list = { 5, 9, 3, 12, 7, 3, 11, 5 };
        // Display Array in order

        System.out.println("Array elements:");
        int index = 0;
        while (index < list.length) {
            System.out.println(list[index]);
            index++;
        }
        // Display Array in Reverse

        System.out.println("Reverse array loop:");
        System.out.println();

        int[] result = new int[list.length];

        for (int i = 0; i < list.length; i++) {
            int j = result.length - 1 - i;
            result[j] = list[i];
        }

        for (int num : result) {
            System.out.println(num);
        }

        System.out.println("First element in the array: " + list[0]);
        System.out.println("Last element in the array: " + list[list.length - 1]);
        System.out.println();

        // Display max, min, sum, and average
        System.out.println("Maximum value in the array: " + lab.max(list));
        System.out.println("Minimum value in the array: " + lab.min(list));
        System.out.println("Sum of the array elements: " + lab.sum(list));
        System.out.println("Average in the array elements: " + lab.average(list));
    }
}

// Lab1 class with the methods
class Lab1 {

    public int increment(int num) {
        return ++num;
    }

    public int max(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public int min(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public double average(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return (double) sum / nums.length;
    }
}
