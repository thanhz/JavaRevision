package Questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BestTimeBuySellStock {
    //[7,1,5,3,6,4]
    //[7,6,4,3,1]
    //[2,1,2,1,0,1,2]
    //[3,3,5,0,0,3,1,4]
    //[3,3,5,0,0,3,1,4]
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        //int maxPrice = Integer.MIN_VALUE;
        int profit = 0;

        for(Integer stock : prices){
            if(stock < minPrice){
                minPrice = stock;
            } else if (stock - minPrice > profit){
                profit = stock - minPrice;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = Arrays.asList(1,2,3,4,5);
        int[]array = new int[]{2,1,2,1,0,1,2};
        System.out.println(maxProfit(array));
    }
}
