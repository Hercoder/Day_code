public class Test {
    public static void main(String[] args) {
        int[] A={1,2,3,4};
        int[] B={2,4,5,6};
        T6 test = new T6();
        int[] a = test.mergeSortedArray(A,B);
        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);
        }

    }
}
