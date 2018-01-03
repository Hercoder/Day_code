public class T14 {
    public int binarySearch(int[] nums, int target) {
        //write your code here
        int start = 0;
        int end = nums.length-1;
        int middle = 0;
        while (start < end) {               //不需要等号
            middle = (end + start)/2;
            if (nums[middle] < target) {
                start = middle + 1;
            } else if (nums[middle] > target) {
                end = middle - 1;
            } else {
                end = middle;
            }
        }
        if (nums[end] == target) {
            return end;
        }
        return -1;
    }
}
