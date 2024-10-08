class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
       int n=digits.size();
       for(int i=n-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
       } 
       digits.insert(digits.begin(), 1);
       return digits;
    }
};


// class Solution {
// public:
//     vector<int> plusOne(vector<int>& digits) {
//         int carry = 1;
//         int n = digits.size();
//         for (int i = n - 1; i >= 0; --i) {
//             int sum = digits[i] + carry;
//             digits[i] = sum % 10;
//             carry = sum / 10;
//             if (carry == 0) break;
//         }
//         if (carry > 0) {
//             digits.insert(digits.begin(), 1);
//         }
//         return digits;
//     }
// };
