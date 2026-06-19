1class Solution {
2    public int minOperations(String[] logs) {
3        int n = logs.length;
4        if(n == 0) return 0;
5        int filelocation = 0;
6        for(int i = 0; i < n; i++){
7            if(logs[i].equals("../")){
8                if(filelocation >0){
9                    filelocation--;
10                }
11            }else if(!logs[i].equals("./")){
12                filelocation++;
13            }
14        }
15        return filelocation;
16    }
17}