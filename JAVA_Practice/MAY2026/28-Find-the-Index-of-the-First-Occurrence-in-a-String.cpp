class Solution {
public:
    int strStr(string haystack, string needle) {
        if(haystack == needle) return 0; // Correct but not necessary
        int hsize = haystack.size();
        int nsize = needle.size();
        for(int i = 0; i <= hsize - nsize; i++){ // Fixed loop condition
            if(haystack.substr(i, nsize) == needle){
                return i;
            }
        }
        return -1;
    }
};
