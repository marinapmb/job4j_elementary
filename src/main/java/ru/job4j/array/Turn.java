package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
         for (int index = 1; index <= array.length  / 2; index++) {
            int temp = array[index - 1];
            array[index - 1] = array[array.length - index];
            array[array.length - index] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] result = back(numbers);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
       }
    }
}
