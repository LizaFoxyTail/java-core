package lessons.lesson12.StreamAPI;

import java.util.*;

public class Three {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 2, 33, 4, 25);
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i : nums) {
            if (i < min) min = i;
            if (i > max) max = i;
        }
        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);

        List<Integer> nums1 = List.of(10, 2, 33, 4, 25);
        int min1 = nums1.stream()
            .reduce(Integer::min).get();
        int max1 = nums1.stream()
            .reduce(Integer::max).get();

        System.out.println("Minimum = " + min1);
        System.out.println("Maximum = " + max1);

    }
}
