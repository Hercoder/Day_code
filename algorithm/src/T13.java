public class T13 {
    /*
     * @param source: source string to be scanned.
     * @param target: target string containing the sequence of characters to match
     * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
     */
    public int strStr(String source, String target) {
        // write your code here
        if (source == null || target == null) {
            return -1;
        }
        if (source.length() == 0 && target.length() == 0) {
            return 0;
        }
        if (source.length() == 0) {
            return -1;
        }
        if (target.length() == 0) {
            return -0;
        }
        char[] sou = source.toCharArray();
        char[] tar = target.toCharArray();
        if (source.length() == target.length()) {
            for (int i = 0; i < sou.length ; i++) {
                if (sou[i] != tar[i]) {
                    return -1;
                }
            }
            return 0;
        }
        for (int i = 0; i <= sou.length - tar.length; i++) {
            int j;
            for (j = 0; j < tar.length; j++) {
                if (sou[i+j] != tar[j]) {
                    break;
                }
            }
            if (j == tar.length) {
                return i;
            }
        }
        return -1;
    }
}
