package ss13_search_algorithm.bai_tap.zz2_binary_search_recurion;

public class AlgorithmComplexityTest {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int middle = (left + right) / 2;
            if (value == array[middle]) {
                return middle;
            } else if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            } else return binarySearch(array, middle + 1, right, value);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 0, list.length - 1, 2));
        System.out.println(binarySearch(list, 0, list.length - 1, 11));
        System.out.println(binarySearch(list, 0, list.length - 1, 79));
        System.out.println(binarySearch(list, 0, list.length - 1, 1));
        System.out.println(binarySearch(list, 0, list.length - 1, 5));
        System.out.println(binarySearch(list, 0, list.length - 1, 80));
    }
}
