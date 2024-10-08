import java.util.Arrays;

public  class Task2 {
    public static void main(String[] args) {
        int[] arr3 = {10, 5, 15, 20, 25};
        System.out.println(varianceMaxMin(arr3));

    }
    //    Написать функцию, возвращающую разницу между самым
   //    большим и самым маленьким элементами переданного не пустого массива.

    public static int varianceMaxMin(int[]arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }

}