import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[]arr = new int[]{1,2,3,4,5,6,7,8};
        System.out.println(evenNumber(arr));
    }
    //Написать метод, возвращающий количество чётных элементов массива.
   // countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

    private static int evenNumber(int[]arr){
        return (int) Arrays.stream(arr).filter(i->i %2 == 0).count();

//        int count = 0;
//        int[]newArray = Arrays.stream(arr).toArray();
//        for (int i = 0; i < newArray.length; i++) {
//            if (newArray[i] % 2 == 0){
//                count++;
//            }
//        }
//        return count;
    }
}

