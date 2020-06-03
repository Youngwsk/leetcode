package array.medium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *  18. 四数之和
 *
 *  给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，
 *  使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 *  答案中不可以包含重复的四元组.
 *
 *  示例：
 *      给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
 *      满足要求的四元组集合为：
 *      [
 *        [-1,  0, 0, 1],
 *        [-2, -1, 1, 2],
 *        [-2,  0, 0, 2]
 *      ]
 *
 * @author wsk
 * @date 2020/6/3 9:06
 */
public class FourSum {

    public List<List<Integer>> fouSum(int[] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if(nums == null || len < 4){
            return ans;
        }
        // 将数组排序
        Arrays.sort(nums);
        // 定义4个指针k，i，j，h  k从0开始遍历，i从k+1开始遍历，留下j和h，j指向i+1，h指向数组最大值
        for(int k = 0;k<len-3;k++){
            // 当k的值与前面的值相等时忽略
            if(k>0 && nums[k] == nums[k-1]){
                continue;
            }
            // 获取当前最小值，如果最小值比目标值大，说明后面越来越大的值根本没戏
            int min1 = nums[k] + nums[k+1] + nums[k+2] + nums[k+3];
            if(min1 > target){
                continue;
            }
            // 获取当前最大值，如果最大值比目标值小，说明后面越来越小的值根本没戏，忽略
            int max1 = nums[k] + nums[len-1] + nums[len-2] + nums[len-3];
            if(max1 < target){
                continue;
            }
            // 第二层循环i，初始值指向k+1
            for(int i = k+1;i<len-2;i++){
                if(i>k+1 && nums[i] == nums[i-1]){
                    continue;
                }
                // 定义指针j指向i+1
                int j = i+1;
                // 定义指针h指向数组末尾
                int h = len-1;
                // 获取当前最小值，如果最小值比目标值大，说明后面越来越大的值根本没戏，忽略
                int min = nums[k] + nums[i] + nums[j] + nums[j+1];
                if(min > target){
                    continue;
                }
                // 获取当前最大值，如果最大值比目标值小，说明后面越来越小的值根本没戏，忽略
                int max = nums[k] + nums[i] + nums[h] + nums[h-1];
                if(max < target){
                    continue;
                }
                // 开始j指针和h指针的表演，计算当前和，如果等于目标值，j++并去重，h--并去重，当当前和大于目标值时h--，当当前和小于目标值时j++
                while (j<h){
                    int curr = nums[k] + nums[i] + nums[j] + nums[h];
                    if(curr == target){
                        ans.add(Arrays.asList(nums[k],nums[i],nums[j],nums[h]));
                        j++;
                        h--;
                        while (j<h && nums[j] == nums[j-1]) j++;
                        while (j<h && nums[h] == nums[h+1]) h--;
                    }else if(curr > target){
                        h--;
                    }else {
                        j++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 0, -1, 0, -2, 2};
        System.out.println(new FourSum().fouSum(nums,0));
    }
}