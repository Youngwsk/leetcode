package array.medium;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *  **39. 组合总和
 *
 *  给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *  candidates 中的数字可以无限制重复被选取。
 *
 *  说明：
 *      所有数字（包括 target）都是正整数。
 *      解集不能包含重复的组合。
 *
 *  示例 1:
 *      输入: candidates = [2,3,6,7], target = 7,
 *      所求解集为:
 *      [
 *          [7],
 *          [2,2,3]
 *      ]
 *
 *  示例 2:
 *      输入: candidates = [2,3,5], target = 8,
 *      所求解集为:
 *      [
 *          [2,2,2,2],
 *          [2,3,3],
 *          [3,5]
 *      ]
 *
 * @author wsk
 * @date 2020/6/5 8:44
 */
public class CombinationSum {
    List<List<Integer>> lists = new ArrayList<>();
    public List<List<Integer>> conbinationSum(int[] candidates, int target){
        if(candidates == null || candidates.length == 0 || target < 0){
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        process(0,candidates,target,list);
        return lists;
    }

    private void process(int start, int[] candidates, int target, List<Integer> list) {
        //递归的终止条件
        if(target < 0){
            return;
        }
        if(target == 0){
            lists.add(new ArrayList<>(list));
        }else{
            for(int i = start;i<candidates.length;i++){
                list.add(candidates[i]);
                //因为每个数字都可以使用无数次，所以递归还可以从当前元素开始
                process(i, candidates,target - candidates[i],list);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates = new int[]{2,3,6,7};
        List<List<Integer>> lists = new CombinationSum().conbinationSum(candidates, 7);
        Iterator<List<Integer>> iterator = lists.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}