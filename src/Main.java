import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        int[] arr1 = {1, 2, 3};
        double[] arr2 = {1.57, 7.654, 9.986};
        String[] arr3 = {"a", "b", "c"};

        // Задача 2
        System.out.println(Arrays.toString(arr1).replaceAll("[\\[\\]]", ""));
        System.out.println(Arrays.toString(arr2).replaceAll("[\\[\\]]", ""));
        System.out.println(Arrays.toString(arr3).replaceAll("[\\[\\]]", ""));

        // Задача 3
        printReversed(arr1);
        printReversed(arr2);
        printReversed(arr3);

        // Задача 4
        Arrays.setAll(arr1, i -> arr1[i] % 2 != 0 ? arr1[i] + 1 : arr1[i]);
        System.out.println(Arrays.toString(arr1).replaceAll("[\\[\\]]", ""));
    }

    private static void printReversed(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int num : arr) list.add(num);
        Collections.reverse(list);
        System.out.println(list.toString().replaceAll("[\\[\\]]", ""));
    }

    private static void printReversed(double[] arr) {
        List<Double> list = new ArrayList<>();
        for (double num : arr) list.add(num);
        Collections.reverse(list);
        System.out.println(list.toString().replaceAll("[\\[\\]]", ""));
    }

    private static void printReversed(String[] arr) {
        List<String> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println(String.join(", ", list));
    }
}
