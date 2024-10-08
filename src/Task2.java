import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.NoSuchElementException;


public  class Task2 {
    public static void main(String[] args) {
        int[] arr3 = {10, 5, 15, 20, 25};
        System.out.println(varianceMaxMin(arr3));

    }
    //    Написать функцию, возвращающую разницу между самым
   //    большим и самым маленьким элементами переданного не пустого массива.

    public static int varianceMaxMin(int[]arr) {
        if (arr.length == 0){
            throw new NoSuchElementException("массив не должен быть пустым");
        }
        return Arrays.stream(arr).max().orElseThrow() - Arrays.stream(arr).min().orElseThrow();
    }
}