#include <iostream>
#include <vector>
#include <string>

using namespace std;
class Solution {
public:
    int minOperations(vector<string>& logs) {
        int filelocation = 0;
        for(int i = 0; i < logs.size(); i++){
            if(logs[i] == "../"){
                if(filelocation >0){
                    filelocation--;
                }
            }else if(logs[i] == "./"){
                filelocation = filelocation;
            }else {
                filelocation++;
            }
        }
        return filelocation;
    }
};

int main() {
    Solution solution;
    vector<string> logs1 = {"d1/", "d2/", "../", "d21/", "./"};
    vector<string> logs2 = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
    vector<string> logs3 = {"d1/", "../", "../", "../"};

    cout << "Test case 1: " << solution.minOperations(logs1) << endl; // Expected output: 2
    cout << "Test case 2: " << solution.minOperations(logs2) << endl; // Expected output: 3
    cout << "Test case 3: " << solution.minOperations(logs3) << endl; // Expected output: 0

    return 0;
}
