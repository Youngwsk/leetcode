package array.easy;
import java.util.Arrays;
/**
 * 283. 移动零
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 *
 * 说明:
 *  必须在原数组上操作，不能拷贝额外的数组。
 *  尽量减少操作次数。
 *
 * @author wsk
 * @date 2020/5/31 11:10
 */
public class MoveZeroes {
    /**
     * 思路：
     *      遍历nums，设两个指针分别从num[0]开始遍历，num[i]元素不为0则设为nums[j]位置的值，j++，
     *      最后i=j，将j及以后的位置上的元素设为0
     * @param nums
     */
    public static void moveZeroes(int[] nums){
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[j++] = nums[i];
            }
        }

        for(int i = j;i<nums.length;i++){
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}