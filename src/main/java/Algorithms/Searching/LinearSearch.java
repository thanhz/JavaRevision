package Algorithms.Searching;

public class LinearSearch {

    private static int search(int[] array, int target){
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == target)
                return i;
        }
        return -1;
    }

    public static void main(String[]args){
        int[]array = new int[]{1,9,8,2,7,3,6,2,1,5};
        System.out.println(search(array, 2));
    }
}


