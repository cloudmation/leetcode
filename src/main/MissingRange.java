package main;

import java.util.ArrayList;
import java.util.List;

public class MissingRange {
    public List<String> getMissingRange(Integer[] inputs, int lower, int upper) {
        List<String> results = new ArrayList<>();
        int start = lower - 1;
        for(int i = 0; i <= inputs.length; i++){
            int end = (i == inputs.length) ? upper + 1 : inputs[i];
            if(end - start >= 2) {
                results.add(printRange(start + 1, end - 1));
            }
            start = end;
        }
        return results;
    }

    private String printRange(int start, int end) {
        return start == end ? String.valueOf(start) : String.format("%s->%s", start, end);
    }
}
