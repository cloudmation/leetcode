package main;

public class OneEditDistance {

    public boolean isOneEditDistance(String a, String b) {
        if(a.length() > b.length()) return isOneEditDistance(b, a);
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                if(a.length() == b.length()) {
                    return a.substring(i + 1).equals(b.substring(i + 1));
                } else if(b.length() > a.length()) {
                    return a.substring(i).equals(b.substring(i + 1));
                }
            }
        }
        return b.length() - a.length() == 1;
    }

    public boolean isOneEditDistanceDp(String a, String b) {
        return editDistance(a, b) == 1;
    }

    public int editDistance(String a, String b) {
        int[][] table = new int[a.length() + 1][b.length() + 1];
        for(int row = 0; row <= a.length(); row++) {
            table[row][0] = row;
        }

        for (int col = 0; col <= b.length(); col++) {
            table[0][col] = col;
        }
        for(int row = 1; row <= a.length(); row++) {
            for(int col = 1; col <= b.length(); col++){
                if(a.charAt(row - 1) == b.charAt(col - 1)) {
                    table[row][col] = table[row - 1][col - 1];
                } else{
                    table[row][col] = Math.min(table[row - 1][col] + 1, Math.min(table[row - 1][col - 1] + 1, table[row][col - 1] + 1));
                }
            }
        }
        return table[a.length()][b.length()];
    }
}
