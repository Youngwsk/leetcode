package array.easy;

/**
 *  买卖股票的最佳时机
 *
 *  给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
 * 如果你最多只允许完成一笔交易（即买入和卖出一支股票一次），设计一个算法来计算你所能获取的最大利润。
 * 注意：你不能在买入股票前卖出股票。
 *  输入: [7,1,5,3,6,4]
 *  输出: 5
 *
 *  输入: [7,6,4,3,1]
 *  输出: 0
 *  解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
 * @author wsk
 * @date 2020/5/28 0:11
 */
public class MaxProfit {

    public static int maxProfit(int prices[]){
        int maxProfit = 0;
        for(int i = 0;i<prices.length-1;i++){
            for(int j = 1;j<prices.length;j++){
                int profit = prices[j] - prices[i];
                if(profit > maxProfit){
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
//        int prices[] = new int[]{7,6,4,3,1};
        int prices[] = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }


}