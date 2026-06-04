1class Solution {
2    public boolean isValid(String word) {
3        if (word.length() < 3) return false;
4
5        boolean haveVowel = false;
6        boolean haveConsonant = false;
7
8        for (int i = 0; i < word.length(); i++) {
9            char ch = word.charAt(i);
10
11            if (!Character.isLetterOrDigit(ch)) return false;
12
13            if (Character.isLetter(ch)) {
14                char lower = Character.toLowerCase(ch);
15                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
16                    haveVowel = true;
17                } else {
18                    haveConsonant = true;
19                }
20            }
21        }
22        return haveConsonant && haveVowel;
23    }
24}