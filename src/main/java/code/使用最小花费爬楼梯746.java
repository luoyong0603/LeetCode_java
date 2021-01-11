package code;

/**
 * @auther luoyong
 * @date 2020/12/21 17:05
 */
public class 使用最小花费爬楼梯746 {


    public static int minCostClimbingStairs(int[] cost) {
        //从0或1起，
        int ans1 = cost[0];
        int ans2 = cost[1];
        //每次两种选择：进1或进2;枚举0,1；所以直接从2开始；
        for (int i = 2; i < cost.length; i++) {
            int temp = cost[i] + Math.min(ans1, ans2);
            //模拟进1
            ans1 = ans2;
            //模拟进2
            ans2 = temp;
        }
        return Math.min(ans1, ans2);
    }


    public static void main(String[] args) {
        int[] l = new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(minCostClimbingStairs(l));
    }


}
