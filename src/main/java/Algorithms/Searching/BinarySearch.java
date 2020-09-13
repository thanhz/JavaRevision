package Algorithms.Searching;

public class BinarySearch {

    private static int binarySearchRecursive(int[] array, int target, int left, int right) {
        int mid = (left + right) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (target < array[mid]) {
            return binarySearchRecursive(array, target, left, mid-1);
        } else {
            return binarySearchRecursive(array, target, mid+1, right);
        }
    }

    public int runBinarySearchIteratively(int[] sortedArray, int target, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (target > sortedArray[mid] ) {
                low = mid + 1;
            } else if (target < sortedArray[mid]) {
                high = mid - 1;
            } else if (sortedArray[mid] == target) {
                index = mid;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[]array = {1,2,3,4,5,6,7,8};
        System.out.println(binarySearchRecursive(array,2,0,array.length-1));
    }
}
