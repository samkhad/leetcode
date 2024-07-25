package org.example;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
       int nonZeroIndex = 0;
       for (int i=0;i<nums.length;i++){
           if(nums[i] != 0){
               nums[nonZeroIndex] = nums[i];
               nonZeroIndex++;
           }
       }
       while(nonZeroIndex < nums.length){
           nums[nonZeroIndex] = 0;
           nonZeroIndex++;
       }

    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,0,12, 18, 9, 4};
        moveZeroes(nums);
        for(int i: nums){
            System.out.print(i + "");
        }
    }
}
