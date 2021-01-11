package code;

/**
 * @auther luoyong
 * @date 2020/12/25 10:23
 */
public class 删除排序数组中的重复项26 {

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] l = new int[]{1, 1, 1, 2, 3};
        System.out.println(removeDuplicates(l));
    }


}
