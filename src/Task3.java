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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 && array[i+ 1] == 0){
                return true;
            }
        }
        return false;
    }


}
