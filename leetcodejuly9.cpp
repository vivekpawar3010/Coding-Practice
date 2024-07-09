class Solution {
public:
    double averageWaitingTime(vector<vector<int>>& customers) {
        int currentTime = 0;
        long long totalWaitingTime = 0; 

        for (const auto& customer : customers) {
            int arrival = customer[0];
            int time = customer[1];
            if (arrival > currentTime) {
                currentTime = arrival;
            }
            int waitingTime = currentTime + time - arrival;
            totalWaitingTime += waitingTime;
            currentTime += time;
        }

        return static_cast<double>(totalWaitingTime) / customers.size();
    }
};
