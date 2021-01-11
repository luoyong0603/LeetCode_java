package code;

/**
 * @auther luoyong
 * @date 2020/12/24 15:19
 */
public class 分发糖果135 {

    /*
    老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
    你需要按照以下要求，帮助老师给这些孩子分发糖果：
    每个孩子至少分配到 1 个糖果。
    相邻的孩子中，评分高的孩子必须获得更多的糖果。
    那么这样下来，老师至少需要准备多少颗糖果呢？
    * */


    public static int candy(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }
        //记录每个人分到的糖果数
        int[] nums = new int[ratings.length];
        //初始化
        nums[0] = 1;
        //从左往右遍历,如果后一位比前一位分高，就给后一位比前一位多1，否则就给1
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                nums[i] = nums[i - 1] + 1;
                continue;
            }
            nums[i] = 1;
        }
        //从右往左遍历，如果前一位比后一位分高并且得到的糖果小于或等于后一位，就给前一位比后一个多1;
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1] && nums[i] <= nums[i + 1]) {
                nums[i] = nums[i + 1] + 1;
            }
        }
        int count = 0;
        for (int i : nums) {
            count += i;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] l = new int[]{1, 2, 2};
        System.out.println(candy(l));
    }

}
