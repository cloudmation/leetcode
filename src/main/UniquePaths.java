package main;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] map = new int[m+1][n+1];
        return paths(map, m, n);
    }

    private int paths(int[][] map, int m, int n) {
        if(m == 1 || n==1) return 1;
        if(map[m][n] != 0 ) return map[m][n];
        int path = paths(map, m-1, n) + paths(map, m, n-1);
        map[m][n] = path;
        return map[m][n];
    }
}
