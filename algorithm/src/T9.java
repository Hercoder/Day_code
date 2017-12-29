import java.util.ArrayList;
import java.util.List;

public class T9 {
    /*
     * @param n: An integer
     * @return: A list of strings.
     */

    /**
     *  int n = 15;
        T9 test = new T9();
        System.out.println(test.fizzBuzz(n).toString());
     */
    public List<String> fizzBuzz(int n) {
        // write your code here
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%3 == 0 && i%5 == 0) {
                list.add("fizz buzz");
            } else if (i%3 == 0) {
                list.add("fizz");
            } else if (i%5 == 0) {
                list.add("buzz");
            } else {
                list.add(i + "");
            }
        }
        return list;
    }
}
