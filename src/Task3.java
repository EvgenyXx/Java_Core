import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 0, 1, 0, 3};
        System.out.println(hasAdjacentZeros(array));
        int[] array1 = {1, 0, 0, 0, 3};
        System.out.println(hasAdjacentZeros(array1));
    }
    //    Написать функцию, возвращающую истину,
    //    если в переданном массиве есть два соседних элемента, с нулевым значением.
    public static boolean hasAdjacentZeros(int[] array) {
        if (array.length < 2) {
            return false;
        }
        return Arrays.stream(array)
                .reduce((previous, current) -> {
                    if (previous == 0 && current == 0) {
                        return 1;
                    } else {
                        return current;
                    }
                })
                .orElse(0) == 1;
    }



}
