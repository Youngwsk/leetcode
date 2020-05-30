package array.easy;
/**
 * 在既定时间做作业的学生人数
 *
 * 给你两个整数数组 startTime（开始时间）和 endTime（结束时间），并指定一个整数 queryTime 作为查询时间。
 * 已知，第 i 名学生在 startTime[i] 时开始写作业并于 endTime[i] 时完成作业。
 * 请返回在查询时间 queryTime 时正在做作业的学生人数。形式上，返回能够使 queryTime 处于区间 [startTime[i], endTime[i]]（含）的学生人数。
 *
 * 输入：startTime = [4], endTime = [4], queryTime = 4
 * 输出：1
 *
 * 输入：startTime = [4], endTime = [4], queryTime = 5
 * 输出：0
 *
 * 输入：startTime = [9,8,7,6,5,4,3,2,1], endTime = [10,10,10,10,10,10,10,10,10], queryTime = 5
 * 输出：5
 *
 * @author wsk
 * @date 2020/5/29 9:36
 */
public class BusyStudent {
    /**
     * 思路：
     * 遍历数组中的元素，当前元素大于等于startTime并且小于等于endTime，计数器加一，最后返回计数器。
     *
     * @param startTime
     * @param endTime
     * @param queryTime
     * @return
     */
    public static int busyStudent(int[] startTime,int[] endTime,int queryTime){
        int num = 0;
        for(int i = 0;i<startTime.length;i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] startTime = new int[]{9,8,7,6,5,4,3,2,1};
        int[] endTime = new int[]{10,10,10,10,10,10,10,10,10};
        System.out.println(busyStudent(startTime,endTime,5));
    }
}