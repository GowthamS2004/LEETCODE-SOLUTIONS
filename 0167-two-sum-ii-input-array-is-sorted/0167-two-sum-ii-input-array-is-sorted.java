class Solution {
    public int[] twoSum(int[] nums, int target) {
         int[] ans=new int [2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])){
                ans[1]=i+1;
                ans[0]=hm.get(target-nums[i])+1;
                return ans;
            }
            hm.put(nums[i],i);
        }
        return ans;
    }
}