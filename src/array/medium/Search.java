package array.medium;
/**
 *  33. 搜索旋转排序数组
 *
 *  假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 *  ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )
 *  搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 *  你可以假设数组中不存在重复的元素。
 *  你的算法时间复杂度必须是 O(log n) 级别。
 *
 *  示例 1:
 *      输入: nums = [4,5,6,7,0,1,2], target = 0
 *      输出: 4
 *  示例 2:
 *      输入: nums = [4,5,6,7,0,1,2], target = 3
 *      输出: -1
 *
 *
 * @author wsk
 * @date 2020/6/4 10:14
 */
public class Search {
    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target){
        int left = 0;
        int right = nums.length-1;

        while (left<=right){
            int mid = left + (right-left) / 2;
            if(target == nums[mid]){
                return mid;
            }
            // 先根据 nums[mid] 与 nums[lo] 的关系判断 mid 是在左段还是右段
            if(nums[mid] >= nums[left]){
                // 再判断 target 是在 mid 的左边还是右边，从而调整左右边界 lo 和 hi
                if(target >= nums[left] && target < nums[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else{
                if(target > nums[mid] && target <= nums[right]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int i = new Search().search(nums, 2);
        System.out.println(i);
    }
}