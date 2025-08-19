package algorithm.searching;

public class LinearSearch {
    public static void main(String[] args) {
    int[]arr={1,2,4,7,3,5,9,8};
        System.out.println(findTargetIndex(arr,9));
    }

    static int findTargetIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
