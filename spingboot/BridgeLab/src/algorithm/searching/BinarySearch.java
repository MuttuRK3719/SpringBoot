package algorithm.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 12, 14};
        System.out.println(searchOfTargetElement(arr, 12));
    }

    static int searchOfTargetElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else return mid;
        }
        return -1;
    }
}
