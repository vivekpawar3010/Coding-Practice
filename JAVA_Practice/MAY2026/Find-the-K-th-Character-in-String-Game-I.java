1class Solution {
2    public char kthCharacter(int k) {
3        StringBuilder sb = new StringBuilder("a");
4
5        while(sb.length() < k){
6            StringBuilder temp = new StringBuilder(sb);
7            for(int i = 0; i < temp.length(); i++){
8                char ch = temp.charAt(i);
9                if(ch == 'z'){
10                    temp.setCharAt(i, 'a');
11                }else{
12                    temp.setCharAt(i, (char) (ch + 1));
13                }
14            }
15            sb.append(temp);
16        }
17
18        return sb.charAt(k - 1);
19    }
20}