package array.easy;
/**
 * @author wsk
 * @date 2020/5/25 17:21
 */
public class RemoveElement {

    public static int removeElement(int[] nums, int val){
        int i = 0;
        for(int j = 0;j<nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        System.out.println(removeElement(nums,3));
    }


}
