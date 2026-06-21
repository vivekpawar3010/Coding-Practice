1class Solution {
2    public int titleToNumber(String columnTitle) {
3        int columnNum = 0;
4        for(char c : columnTitle.toCharArray()) {
5            columnNum = columnNum * 26 + (c - 'A' + 1);
6        }
7        return columnNum;
8    }
9}