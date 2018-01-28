import java.util.ArrayList;
import java.util.List;

class Interval{
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

/**
 * 注意是否有交并集
 */

public class T30 {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (newInterval == null || intervals == null) {
            return null;
        }
        ArrayList<Interval> results = new ArrayList<>();
        int insertPos = 0;

        for (Interval interval: intervals) {
            if (interval.end < newInterval.start) {
                results.add(interval);
                insertPos++;
            } else if (interval.start > newInterval.end) {
                results.add(interval);
            } else {
                newInterval.start = Math.min(interval.start, newInterval.start);
                newInterval.end = Math.max(interval.end, newInterval.end);
            }
        }
        results.add(insertPos, newInterval);
        return results;
    }
}

