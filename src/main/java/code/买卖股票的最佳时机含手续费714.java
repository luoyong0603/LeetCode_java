package code;

/**
 * @auther luoyong
 * @date 2020/12/17 15:13
 */

/*
* 给定一个整数数组 prices，其中第 i 个元素代表了第 i 天的股票价格 ；非负整数 fee 代表了交易股票的手续费用。
你可以无限次地完成交易，但是你每笔交易都需要付手续费。如果你已经购买了一个股票，在卖出它之前你就不能再继续购买股票了。
返回获得利润的最大值。
注意：这里的一笔交易指买入持有并卖出股票的整个过程，每笔交易你只需要为支付一次手续费。
*
* */
public class 买卖股票的最佳时机含手续费714 {
    public static int maxProfit(int[] prices, int fee) {

        int maxProfit = 0;
        //初始化买入价格【将手续费算进买入价】
        int buy = prices[0] + fee;
        for (int i = 0; i < prices.length; i++) {
            //找最小买入价
            if (prices[i] + fee < buy) {
                buy = prices[i] + fee;
            } else if (prices[i] > buy) {
                //如果下一天价格继续上升，表示在这一天不进行任何操作
                maxProfit += prices[i] - buy;
                //替换
                buy = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] l = new int[]{1, 3, 2, 8, 4, 9};
        System.out.println(maxProfit(l, 2));
    }

}
