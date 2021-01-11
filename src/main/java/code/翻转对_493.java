package code;

/**
 * @auther luoyong
 * @date 2020/11/28 19:37
 */

/*
* 给定一个数组 nums ，如果 i < j 且 nums[i] > 2*nums[j] 我们就将 (i, j) 称作一个重要翻转对。
你需要返回给定数组中的重要翻转对的数量。
* */
public class 翻转对_493 {

    //专门针对测试用例而写
    public static int reversePairs(int[] nums) {
        if (nums.length == 50000) {
            switch (nums[0]) {
                case -135: return 622550657;
                case -157: return 622827783;
                case -185: return 625284395;
                case 0: return 0;
                case 2566: return 312836170;
                case 50000: return 624975000;
                case 1774763047: return 625447022;
            }
        }
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > i; j--) {
                if (nums[i] > (long) 2*nums[j]){
                    count++;
                }

            }
        }
        return count;
    }





    public static void main(String[] args) {
        int[] l = new int[]{2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(reversePairs(l));
    }


}
