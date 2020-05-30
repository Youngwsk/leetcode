package array.easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 拥有最多糖果的孩子
 *
 * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
 * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。
 *
 * 输入：candies = [2,3,5,1,3], extraCandies = 3
 * 输出：[true,true,true,false,true]
 *
 * 输入：candies = [4,2,1,1,2], extraCandies = 1
 * 输出：[true,false,false,false,false]
 *
 * 输入：candies = [12,1,12], extraCandies = 10
 * 输出：[true,false,true]
 * @author wsk
 * @date 2020/5/29 14:31
 */
public class KidsWithCandies {
    /**
     * 思路：
     * 只有孩子拥有的糖果数目candies[i]加上extraCandies大于等于数组中最多的糖果数才可以成为拥有最多的糖果数（即为true）
     * 所以先找到数组中最大的值，然后遍历数组，如果大于等于最大值则list.add(true)否则add(false)
     *
     * @param candies
     * @param extraCandies
     * @return
     */
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> res = new ArrayList<>();
        //Arrays工具类有求最大值的方法，但是效率慢，不如遍历。
        //int max = Arrays.stream(candies).max().getAsInt();
        int max = candies[0];
        for(int i = 1;i<candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i = 0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] candies = new int[]{12,1,12};
        List<Boolean> list = kidsWithCandies(candies, 10);
        list.toArray();
        for(Boolean l : list){
            System.out.println(l);
        }
    }
}