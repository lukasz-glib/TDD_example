package pl.lg.tdd;

public class MaxValue {

    public static int largest(int[] list) {

        if (list.length == 0) {
            throw new RuntimeException("Lista jest pusta");
        }
        int max = list[0];

        for (int index = 0; index < list.length-1; index++) {
            if (list[index] > max) {
                max = list[index];
            }
        }
        return max;
    }
}
