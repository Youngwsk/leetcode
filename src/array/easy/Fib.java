package array.easy;
/**
 * 509. 斐波那契数
 *
 *  斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。
 *  该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 *           F(0) = 0,   F(1) = 1
 *           F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 *  给定 N，计算 F(N)。
 *
 *  输入：2
 *  输出：1
 *  解释：F(2) = F(1) + F(0) = 1 + 0 = 1.
 *
 *  输入：3
 *  输出：2
 *  解释：F(3) = F(2) + F(1) = 1 + 1 = 2.
 *
 * @author wsk
 * @date 2020/6/1 10:22
 */
public class Fib {
    /**
     *  递归：最简单的算法
     * @param N
     * @return
     */
    public int fib(int N){
        if(N <= 1){
            return N;
        }
        return fib(N - 1) + fib(N - 2);
    }

    public static void main(String[] args) {
        System.out.println(new Fib().fib(4));
    }
}