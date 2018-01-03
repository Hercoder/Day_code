public class Upstairs {
    /**
     * 递归解法
     * 因为每次只能走1或2阶，因此，走上第n阶的走法应该等于第n-1阶和n-2阶的和
     * (先走到第n-2阶然后走两阶，或者先走上第n-1阶然后走一阶)。利用
     * f(n) = f(n-1) + f(n-2); f(1) = 1, f(2) = 2
     */
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return climbStairs(n-1) + climbStairs(n-2);
        }
    }
}
