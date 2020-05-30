package array.easy;
/**
 *  1399. 统计最大组的数目
 *
 *  给你一个整数 n 。请你先求出从 1 到 n 的每个整数 10 进制表示下的数位和（每一位上的数字相加），然后把数位和相等的数字放到同一个组中。
 *  请你统计每个组中的数字数目，并返回数字数目并列最多的组有多少个。
 *
 *  输入：n = 13
 *  输出：4
 *  解释：总共有 9 个组，将 1 到 13 按数位求和后这些组分别是：
 *  [1,10]，[2,11]，[3,12]，[4,13]，[5]，[6]，[7]，[8]，[9]。总共有 4 个组拥有的数字并列最多
 *
 *  输入：n = 2
 *  输出：2
 *  解释：总共有 2 个大小为 1 的组 [1]，[2]。
 *
 *  输入：n = 15
 *  输出：6
 *
 * @author wsk
 * @date 2020/5/30 11:04
 */
public class CountLargestGroup {

    public int countLargestGroup(int n){
        int ans = 0,max = 1;
        int[] count = new int[n+1];
        int[] sum = new int[n+1];

        for(int i = 1;i<=n;i++){
            sum[i] = sum[i / 10] + i % 10;
            count[sum[i]]++;
            if(count[sum[i]] > max){
                max = count[sum[i]];
            }
        }
        for(int num : count) ans += num == max ? 1 : 0;
        return ans;
    }

}
