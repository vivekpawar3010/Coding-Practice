1class Solution {
2    public String reversePrefix(String word, char ch) {
3        int n = word.length();
4
5        char[] charr = word.toCharArray();
6        int idx = 0;
7        for(int i = 0; i < n; i++){
8            if(charr[i] == ch) {
9                idx = i;
10                break;
11            }
12        }   
13
14        int i = 0; 
15        while(idx > i){
16            char temp = charr[i];
17            charr[i] = charr[idx];
18            charr[idx] = temp;
19            i++;
20            idx--;
21        }
22
23        return new String(charr);
24    }
25}