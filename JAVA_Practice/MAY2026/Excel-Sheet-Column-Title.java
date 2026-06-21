1class Solution {
2    public String convertToTitle(int columnNumber) {
3        StringBuilder result = new StringBuilder();
4        
5        while (columnNumber > 0) {
6            columnNumber--;
7            char ch = (char) ('A' + (columnNumber % 26));
8            result.append(ch);
9            columnNumber /= 26;
10        }
11        
12        return result.reverse().toString(); 
13    }
14}
15