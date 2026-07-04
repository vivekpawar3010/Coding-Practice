import java.util.*;

public class JUNE_14_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };

        int result = sol.canCompleteCircuit(gas, cost);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int gasdiffcost = 0;
        int cangost = 0;
        for (int i = 0; i < n; i++) {
            if (gas[i] < cost[i])
                cangost = i + 1;
            gasdiffcost += (gas[i] - cost[i]);
        }
        if (gasdiffcost < 0)
            return -1;
        return cangost;
        // int cangost = 0;
        // int currgas = 0;
        // for(int i = 0; i < n; i++){
        // currgas += (gas[i] - cost[i]);
        // if(currgas < 0){
        // currgas = 0;
        // cangost = i + 1;
        // }
        // }
        // return cangost;
    }
}
