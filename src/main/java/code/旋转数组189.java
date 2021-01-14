package code;

/**
 * @author LuoYong
 * @date 2021/1/8 20:38
 */
public class 旋转数组189 {

    public static void rotate(int[] nums, int k) {
        //k%nums求余，查看要循环几次
        for (int i = 0; i < k % nums.length; i++) {
            //记住尾巴
            int temp = nums[nums.length - 1];
            //每循环一次就全部替换一次
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            //尾替换头
            nums[0] = temp;
        }
    }

    public static void main(String[] args) {

        int[] l = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(l, 3);
//        System.out.println(rotate(l,3));
    }


}
