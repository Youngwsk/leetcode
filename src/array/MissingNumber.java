package array;
/**
 * 消失的数字
 *
 *数组nums包含从0到n的所有整数，但其中缺了一个。请编写代码找出那个缺失的整数。你有办法在O(n)时间内完成吗？
 * 输入：[3,0,1]
 * 输出：2
 *
 * 输入：[9,6,4,2,3,5,7,0,1]
 * 输出：8
 *
 * @author wsk
 * @date 2020/5/28 13:50
 */
public class MissingNumber {

    public static int missingNumber(int[] nums){
        int sum = 0;
        for(int x : nums){
            sum += x;
        }
        return nums.length*(nums.length+1)/2-sum;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,0,1};
        System.out.println(missingNumber(nums));
    }

}
