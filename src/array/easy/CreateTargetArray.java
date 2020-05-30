package array.easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *  1389. 按既定顺序创建目标数组
 *
 *  给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
 *      -目标数组 target 最初为空。
 *      -按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
 *      -重复上一步，直到在 nums 和 index 中都没有要读取的元素。
 *  请你返回目标数组。
 *  题目保证数字插入位置总是存在。
 *
 *  提示：
 *  1 <= nums.length, index.length <= 100
 *  nums.length == index.length
 *  0 <= nums[i] <= 100
 *  0 <= index[i] <= i
 *
 *  输入：nums = [0,1,2,3,4], index = [0,1,2,2,1]
 *  输出：[0,4,1,3,2]
 *  解释：
 *  nums       index     target
 *  0            0        [0]
 *  1            1        [0,1]
 *  2            2        [0,1,2]
 *  3            2        [0,1,3,2]
 *  4            1        [0,4,1,3,2]
 *
 *  输入：nums = [1,2,3,4,0], index = [0,1,2,3,0]
 *  输出：[0,1,2,3,4]
 *  解释：
 *  nums       index     target
 *  1            0        [1]
 *  2            1        [1,2]
 *  3            2        [1,2,3]
 *  4            3        [1,2,3,4]
 *  0            0        [0,1,2,3,4]
 *
 *
 * @author wsk
 * @date 2020/5/30 9:54
 */
public class CreateTargetArray {
    /**
     *  思路：
     *   最重要的是：数组某位置上已有元素，此位置再插入其他元素，该位置及以后的元素都要右移。这就要选择ArrayList了，在中间add一个元素，其他元素右移
     *   根据提示可知，target目标数组容量不少于num.length，
     *   遍历nums和index数组，将index[i]作为ArrayList数组的下标，num[i]作为值，添加到ArrayList中
     *   最后将ArrayList数组中的元素添加到target数组，然后返回。
     *
     * @param nums
     * @param index
     * @return
     */
    public static int[] createTargetArray(int[] nums,int[] index){
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i< nums.length;i++){
            list.add(index[i],nums[i]);
        }

        int[] target = new int[nums.length];
        for(int i = 0;i< nums.length;i++){
            target[i] = list.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,3,4};
        int[] index = new int[]{0,1,2,2,1};
        int[] target = createTargetArray(nums, index);
        System.out.println(Arrays.toString(target));
    }

}
