package main;

public class LongestPalindrome {

    private String result = "";

    public String longestPalindrome(String s) {
        result = "";
        for(int i = 0; i<s.length();i++){
            expandAroundCenter(s, i, i);
            expandAroundCenter(s, i, i+1);
        }
        return result;
    }

    public String LongestPalindromeDp(String s) {
        boolean[][] table = new boolean[s.length()][s.length()];
        String result = "";
        for(int j = 0;j < s.length(); j++){
            for(int i = 0; i <= j; i++) {
                System.out.println(String.format("Visited: (%s,%s)", i, j));
                table[i][j] = s.charAt(i) == s.charAt(j) && (j-i<=2 || table[i+1][j-1]);
                if(table[i][j] && (j - i + 1 > result.length())) {
                    result = s.substring(i, j + 1);
                }
            }
        }
        return result;
    }

    private void expandAroundCenter(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        System.out.println("left: " + (left + 1) + " right:" + right);
        String current = s.substring(left + 1, right);
        this.result = this.result.length() < current.length() ? current : this.result;
    }
}
