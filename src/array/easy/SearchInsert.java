package array.easy;

import java.util.HashMap;

/**
 *搜索插入位置
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * @author wsk
 * @date 2020/5/25 20:29
 */
public class SearchInsert {
    /**
     *二分查找法求解
     * @param nums
     * @param target
     * @return
     */
    public static int searchInset(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;
        while (left <= right){
            int mid = (left+right) / 2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,5,6};
        System.out.println(searchInset(nums,7));
    }
}