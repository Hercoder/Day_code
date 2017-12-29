
public class T6 {
    /*
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
        int[] list = new int[A.length + B.length];
        int len = 0;
        int i = 0;
        int j = 0;
        while (i < A.length && j < B.length) {
            if (A[i] <= B[j]) {
                list[len++] = A[i++];
            } else {
                list[len++] = B[j++];
            }
        }
        while (i < A.length) {
            list[len++] = A[i++];
        }
        while (j < B.length) {
            list[len++] = B[j++];
        }
        return list;
    }
}
