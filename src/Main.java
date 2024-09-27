import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(evenNumber(arr));


    }

    private static int evenNumber(int[]arr){
        int count = 0;
        int[]newArray = Arrays.stream(arr).toArray();
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }
}

//Написать метод, возвращающий количество чётных элементов массива.
// countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0