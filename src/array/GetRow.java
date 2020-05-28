package array;
import java.util.ArrayList;
import java.util.List;
/**
 * .杨辉三角 II
 *
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 输入: 3
 * 输出: [1,3,3,1]
 *
 * @author wsk
 * @date 2020/5/27 23:34
 */
public class GetRow {

    public static List<Integer> getRow(int rowIndex){
        List<Integer> pre = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();

        for(int i = 0;i<=rowIndex;i++){
            cur = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if (j == 0 || j == i) {
                    cur.add(1);
                }else {
                    cur.add(pre.get(j-1)+pre.get(j));
                }
            }
            pre = cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(getRow(3));
    }



}
