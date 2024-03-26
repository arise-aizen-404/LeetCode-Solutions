// class Solution {
//     public int firstMissingPositive(int[] nums) {
//         int n = nums.length;
//         HashMap<Integer, Boolean> hMap = new HashMap<>();
//         for (int ele : nums) hMap.put(ele, true);
//         for (int i = 1; i <= n; ++i) {
//             if (!hMap.containsKey(i)) // Corrected method name
//                 return i;
//         }
//         return n + 1;
//     }
// }

class Solution {
    public int firstMissingPositive(int[] nums) {
       int i=0;
       while(i<nums.length){
        int correct=nums[i]-1;
        if(correct!=i && nums[i]>0 && nums[i]<nums.length){
            if(nums[i]!=nums[nums[i]-1]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        else{
            i++;
        }
       }
       for(int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
            return j+1;
        }
       }
       return nums.length+1;
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}