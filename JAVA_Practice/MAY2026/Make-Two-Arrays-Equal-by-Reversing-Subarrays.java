1class Solution {
2    public boolean canBeEqual(int[] target, int[] arr) {
3        if(target.length != arr.length) return false;
4        int[] check = new int[1001];
5        for(int n : target){
6            check[n]++;
7        }
8
9        for(int n : arr){
10            if(check[n] == 0) return false;
11            check[n]--;
12        }
13        return true;
14        
15    }
16}
17
18// class Solution {
19//     public boolean canBeEqual(int[] target, int[] arr) {
20//         if(target.length != arr.length) return false;
21//         int n = target.length;
22//         for(int i = 0; i < n; i++){
23//             for(int j = 0; j < n; j++){
24//                 if(target[i] == arr[j]){
25//                     arr[j] = 0;
26//                     target[i] = 0;
27//                     break;
28//                 }
29//             }
30//         }
31
32//         for(int i = 0; i < n; i++){
33//             if(target[i] != 0 || arr[i] != 0){
34//                 return false;
35//             }
36//         }
37//         return true;
38//     }
39// }