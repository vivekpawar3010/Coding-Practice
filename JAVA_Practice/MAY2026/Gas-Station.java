1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int n = gas.length;
4        int gasdiffcost = 0;
5        int cangost = 0;
6        for(int i = 0; i < n; i++){
7            if(gas[i] < cost[i]) cangost =  i + 1;
8            gasdiffcost += (gas[i] - cost[i]);
9        }
10        if(gasdiffcost < 0) return -1;
11        return cangost;
12
13        // int cangost = 0;
14        // int currgas = 0;
15        // for(int i = 0; i < n; i++){
16        //     currgas += (gas[i] - cost[i]);
17        //     if(currgas < 0){
18        //         currgas = 0;
19        //         cangost =  i + 1;
20        //     }
21        // }
22
23        // return cangost;
24    }
25}