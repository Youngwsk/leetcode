package array;
/**
 * 找出数组中的幸运数
 *
 * 在整数数组中，如果一个整数的出现频次和它的数值大小相等，我们就称这个整数为「幸运数」。
 * 给你一个整数数组 arr，请你从中找出并返回一个幸运数。
 *         如果数组中存在多个幸运数，只需返回 最大 的那个。
 *         如果数组中不含幸运数，则返回 -1 。
 *
 *      提示：
 *      1 <= arr.length <= 500
 *      1 <= arr[i] <= 500
 *
 *  输入：arr = [2,2,3,4]
 *  输出：2
 *  解释：数组中唯一的幸运数是 2 ，因为数值 2 的出现频次也是 2
 *
 *  输入：arr = [1,2,2,3,3,3]
 *  输出：3
 *
 *  输入：arr = [2,2,2,3,3]
 *  输出：-1
 * @author wsk
 * @date 2020/5/29 15:43
 */
public class FindLucky {
    /** 思路： 提示很重要！
     *
     *  元素的值与出现的次数相等才为幸运数， 1 <= arr[i] <= 500
     *
     *  新建一个可以容纳超过500容量的数组存arr元素出现的次数，数组的下标是元素的值，数组的值是元素出现的次数。
     *
     *  遍历原数组，每遍历到一个元素，新数组将元素的值作为新数组的下标，该下标的值+1，计算元素出现的次数。
     *
     *  然后从末尾遍历新数组，第一个找到的幸运数（count[i] == i）即为最大的，如果找不到返回-1
     *
     * @param arr
     * @return
     */
    public static int findLucky(int[] arr){
        int[] count = new int[501];
        for(int i : arr){
            count[i]++;
        }

        for(int i = count.length-1;i>0;i--){
            if(count[i] == i){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2,2,2,3,3};
        System.out.println(findLucky(arr));
    }
}