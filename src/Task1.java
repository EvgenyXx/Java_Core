import java.util.Arrays;
import java.util.NoSuchElementException;

public class Task1 {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(evenNumber(arr));
    }
    //Написать метод, возвращающий количество чётных элементов массива.
   // countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

    private static int evenNumber(int[]arr) {
        if (arr.length == 0){
            throw new NoSuchElementException("массив не должен быть пустым");
        }
        return (int) Arrays.stream(arr).filter(i -> i % 2 == 0).count();
    }
}

