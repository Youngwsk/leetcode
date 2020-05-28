package array;
import java.util.ArrayList;
import java.util.List;
/**
 *  杨辉三角
 *
 *  给定一个非负整数 numRows，生成杨辉三角的前 numRows 行
 *
 *  输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * @author wsk
 * @date 2020/5/27 18:05
 */
public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> triangle = new ArrayList<>();
        //第一种情况 numRows为0
        if(numRows == 0){
            return triangle;
        }
        //第二种情况 numRows不为0
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int rowNum = 1;rowNum<numRows;rowNum++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum-1);
            row.add(1);
            for(int j = 1;j<rowNum;j++){
                row.add(prevRow.get(j-1)+prevRow.get(j));
            }
            row.add(1);

            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = generate(5);
        for(List list1 : list){
            System.out.println(list1);
        }
    }
}