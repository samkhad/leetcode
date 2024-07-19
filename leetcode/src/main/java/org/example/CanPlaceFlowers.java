package org.example;

public class CanPlaceFlowers {

    public static  boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i=0;i<flowerbed.length; i++){
            boolean left = i == 0 || flowerbed[i-1]==0;
            boolean right = i == flowerbed.length -1 || flowerbed[i+1] == 0;

            if(left && right && flowerbed[i] == 0){
                flowerbed[i] = n;
                n--;
            }
        }
        return n<=0;
    }

    public static void main(String[] args) {
       int[] flowerbed = new int[] {1,0,0,0,1};
       int n = 1;
       boolean res =canPlaceFlowers(flowerbed, n);
        System.out.println(res);

        int[] flowerbed2 = new int[]{1,0,0,0,1};
        int m = 2;
        boolean res1 =canPlaceFlowers(flowerbed2, m);
        System.out.println(res1);
    }
}
