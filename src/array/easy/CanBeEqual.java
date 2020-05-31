package array.easy;
import java.util.Arrays;
/**
 * 5408. 通过翻转子数组使两个数组相等
 *
 * 给你两个长度相同的整数数组 target 和 arr 。
 * 每一步中，你可以选择 arr 的任意 非空子数组 并将它翻转。你可以执行此过程任意次。
 * 如果你能让 arr 变得与 target 相同，返回 True；否则，返回 False 。
 *
 * 输入：target = [1,2,3,4], arr = [2,4,1,3]
 * 输出：true
 * 解释：你可以按照如下步骤使 arr 变成 target：
 * 1- 翻转子数组 [2,4,1] ，arr 变成 [1,4,2,3]
 * 2- 翻转子数组 [4,2] ，arr 变成 [1,2,4,3]
 * 3- 翻转子数组 [4,3] ，arr 变成 [1,2,3,4]
 * 上述方法并不是唯一的，还存在多种将 arr 变成 target 的方法。
 *
 * 输入：target = [7], arr = [7]
 * 输出：true
 * 解释：arr 不需要做任何翻转已经与 target 相等。
 *
 * @author wsk
 * @date 2020/5/31 9:15
 */
public class CanBeEqual {
    /**
     * 思路：
     * 只考虑判断是否可以翻转，不考虑如何实现！
     *
     * 要想让俩数组变得相同，1.数组长度必须相同 2.排序之后的元素必须相同！
     *
     * @param target
     * @param arr
     * @return
     */
    public static boolean canBeEqual(int[] target,int[] arr){
        if(target.length != arr.length){
            return false;
        }

        Arrays.sort(target);
        Arrays.sort(arr);

        for(int i = 0;i<target.length;i++){
            if(target[i] != arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] target = new int[]{1,2,3,4};
        int[] arr = new int[]{2,4,1,3};
        boolean b = canBeEqual(target, arr);
        System.out.println(b);
    }
}
