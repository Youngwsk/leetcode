package array.easy;
import java.util.Arrays;
/**
 *  面试题 10.01. 合并排序的数组
 *
 *  给定两个排序后的数组 A 和 B，其中 A 的末端有足够的缓冲空间容纳 B。 编写一个方法，将 B 合并入 A 并排序。
 *  初始化 A 和 B 的元素数量分别为 m 和 n。
 *
 *  输入:
 *  A = [1,2,3,0,0,0], m = 3
 *  B = [2,5,6],       n = 3
 * 输出: [1,2,2,3,5,6]
 *
 * 说明: A.length == n + m
 *
 * @author wsk
 * @date 2020/6/1 9:52
 */
public class Merge2 {
    /**
     * 简单思路：
     *          将B合并到A上，然后使用sort排序
     *
     * @param A
     * @param m
     * @param B
     * @param n
     * @return
     */
    public static int[] merge(int[] A,int m ,int[] B,int n){
        for(int i = 0;i<B.length;i++){
            A[m++] = B[i];
        }

        Arrays.sort(A);
        return A;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,0,0,0};
        int[] B = new int[]{2,5,6};
        int[] res = merge(A, 3, B, 3);
        System.out.println(Arrays.toString(res));
    }
}