
public class T6 {
    /**
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    /**
     *
     *  int[] A={1,2,3,4};
        int[] B={2,4,5,6};
        T6 test = new T6();
        int[] a = test.mergeSortedArray(A,B);
        for (int i = 0; i < a.length ; i++) {
        System.out.println(a[i]);
        }
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


