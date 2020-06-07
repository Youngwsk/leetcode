package array.medium;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/**
 *  40. 组合总和 II
 *
 *  给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *  candidates 中的每个数字在每个组合中只能使用一次。
 *
 *  说明：
 *      所有数字（包括目标数）都是正整数。
 *      解集不能包含重复的组合。
 *
 *  示例 1:
 *      输入: candidates = [10,1,2,7,6,1,5], target = 8,
 *      所求解集为:
 *      [
 *          [1, 7],
 *          [1, 2, 5],
 *          [2, 6],
 *          [1, 1, 6]
 *      ]
 *
 *  示例 2:
 *      输入: candidates = [2,5,2,1,2], target = 5,
 *      所求解集为:
 *      [
 *          [1,2,2],
 *          [5]
 *      ]
 *
 * @author wsk
 * @date 2020/6/7 18:45
 */
public class CombinationSum2 {

    /**
     * 典型的回溯算法题目。
     *  解决一个回溯问题，实际上就是一个决策树的遍历过程。
     *  一般来说，我们需要解决三个问题：
     *      1.路径：也就是已经做出的选择。
     *      2.选择列表：也就是你当前可以做的选择。
     *      3.结束条件：也就是到达决策树底层，无法再做选择的条件。
     */

    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        if(candidates.length == 0){
            return res;
        }
        Arrays.sort(candidates);
        comSum2(candidates,target,0,new LinkedList<Integer>());
        return res;
    }

    private void comSum2(int[] candidates, int target, int index, LinkedList<Integer> trace) {
        //满足结束条件
        if(target == 0){
            res.add(new LinkedList<>(trace));
            return;
        }
        //选择列表，并加上约束
        if(target > 0){
            for(int i = index;i<candidates.length;i++){
                //如果以当前结点为头结点的所有组合都找完了，那么下一个与他他相同的头结点就不用去找了。
                if(i > index && candidates[i] == candidates[i-1]){
                    continue;
                }
                //做出选择
                trace.add(candidates[i]);
                comSum2(candidates,target - candidates[i], i+1,trace);
                //撤销选择
                trace.removeLast();
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10,1,2,7,6,1,5};
        List<List<Integer>> lists = new CombinationSum2().combinationSum2(nums, 8);
        Iterator<List<Integer>> iterator = lists.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}