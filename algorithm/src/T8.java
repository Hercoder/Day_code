/**
 * 字符串与字符数组相互转换
 * char[] a = { 'a ', 'b ', 'c '};
 * String b = new String(a);//字符数组到字符串
 * char[] c = b.toCharArray();//字符串转换成字符数组
 */

public class T8 {
    /**
     * @param str: An array of char
     * @param offset: An integer
     * @return: nothing
     * 设计一个算法，把一个含有N个元素的数组循环右移K位，要求时间复杂度为O（N），
     * 且只允许使用两个附加变量。
     */
    /**
     *  char[] str = {'c','p','p','j','a','v','a','p','y'};
        int offset = 25;
        T8 test = new T8();
        test.rotateString(str, offset);
     */
    public void rotateString(char[] str, int offset) {
        // write your code here
        if (str.length != 0) {
            for (int i = 0; i < offset%str.length; i++) {
                char tmp = str[str.length-1];
                for (int pos = str.length - 2; pos >= 0; pos--) {
                    str[pos+1] = str[pos];
                }
                str[0] = tmp;
            }

            for (int k = 0; k < str.length; k++) {
                System.out.println(str[k]);
            }
        }
    }
}
