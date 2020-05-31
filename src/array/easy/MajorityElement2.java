package array.easy;
import java.util.Arrays;
/**
 *  169. 多数元素
 *
 *  给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *  你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *  输入: [3,2,3]
 *  输出: 3
 *
 *  输入: [2,2,1,1,1,2,2]
 *  输出: 2
 *
 * @author wsk
 * @date 2020/5/31 9:48
 */
public class MajorityElement2 {
    /**
     * 排序思路：
     * 数组中总存在多数元素，排好序后，数组中间的元素总是 多数元素，因为它长度大于 n / 2
     *
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length >> 1];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,3};
        System.out.println(majorityElement(nums));
    }

}
