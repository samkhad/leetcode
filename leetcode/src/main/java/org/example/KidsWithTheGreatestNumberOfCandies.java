package org.example;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int m= Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            m=Math.max(m, candies[i]);
        }

        for(int i=0;i<candies.length;i++){
            if(extraCandies+candies[i] >= m){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] candies1 = new int[]{4,2,1,1,2}; int extraCandies1 = 1;
        int[] candies2 = new int[]{2,3,5,1,3}; int extraCandies2 = 3;
        int[] candies3 = new int[]{12,1,12}; int extraCandies3 = 10;

        System.out.println(kidsWithCandies(candies1, extraCandies1));
        System.out.println(kidsWithCandies(candies2, extraCandies2));
        System.out.println(kidsWithCandies(candies3, extraCandies3));
    }

}
