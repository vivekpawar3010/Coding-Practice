public class MAY_22_leetcode {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] logs = { "d1/", "../", "../", "./" };

        int result = sol.minOperations(logs);
        System.out.println("Result: " + result);
    }
}

class Solution {
    public int minOperations(String[] logs) {
        int n = logs.length;
        if (n == 0)
            return 0;
        int filelocation = 0;
        for (int i = 0; i < n; i++) {
            if (logs[i].equals("../")) {
                if (filelocation > 0) {
                    filelocation--;
                }
            } else if (!logs[i].equals("./")) {
                filelocation++;
            }
        }
        return filelocation;
    }
}