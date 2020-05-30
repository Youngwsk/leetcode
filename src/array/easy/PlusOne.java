package array.easy;
import java.util.Arrays;
/**加一
 *
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字
 *
 * @author wsk
 * @date 2020/5/26 10:29
 */
public class PlusOne {

    public static int[] plusOne(int[] digits){
        for(int i = digits.length-1;i>=0;i--){
            digits[i]++;
            digits[i] = digits[i] % 10;
            if(digits[i] != 0) return digits;
        }
        digits = new int[digits.length+1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{9,9,7,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}