package array.easy;
/**
 *  买卖股票的最佳时机 II
 *
 *  给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 *  设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
 *  注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
 *
 *  输入: [7,1,5,3,6,4]
 * 输出: 7
 *
 * 输入: [1,2,3,4,5]
 * 输出: 4
 *
 * 输入: [7,6,4,3,1]
 * 输出: 0
 *
 * @author wsk
 * @date 2020/5/28 10:59
 */
public class MaxProfit2 {

    public static int maxProfit(int[] prices){
        int maxProfit = 0;
        for(int i = 1;i < prices.length;i++){
            // 后面的价格高于前面的价格才可以买入，保证maxProfit是增长的
            if(prices[i]>prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}