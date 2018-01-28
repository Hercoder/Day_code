public class T28 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if(matrix == null || matrix.length == 0 || matrix[0].length ==0)
            return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = m * n - 1;
        int middle = 0;
        while(left <= right) {
            middle = (right + left)/2;
            int tmp = matrix[middle/n][middle%n];
            if (tmp < target) {
                left = middle + 1;
            } else if (tmp > target) {
                right = middle - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
