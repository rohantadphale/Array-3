import java.util.Arrays;

public class HIndex {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }
        int n = citations.length;
        Arrays.sort(citations);
        int diff = n;
        for (int i = 0; i < n; i++) {

            if (citations[i] >= diff) {
                return diff;
            } else
                diff--;
        }
        return 0;
    }
}
