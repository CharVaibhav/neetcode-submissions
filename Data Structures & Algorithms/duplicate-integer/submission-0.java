class Solution {
    public boolean hasDuplicate(int[] nums) {
        Scanner sc = new Scanner(System.in);
        boolean tf=false;
        HashSet<Integer> duplicate = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            tf=duplicate.add(nums[i]);
            if(tf==false)
            {
                return true;
            }
        }

        return false;
        
    }
}