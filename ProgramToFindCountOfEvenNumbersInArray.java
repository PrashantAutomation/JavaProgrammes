public class Solution {
    
    public static void main(String [] args)
    {
        int[] nums = {12,1,2,44,5555,999999};
       int result = findNumbers(nums);
       System.out.println(result);
    }
    public static int findNumbers(int[] nums) {
        
        int count = 0;
        for(int i=0; i<nums.length; i++)
        {
            int digit = 0;
            while(nums[i]>0)
            {
                
            nums[i] = nums[i]/10;
            digit++;
            }
            if(digit%2==0)
            {
                count++;
            }
        }
        return count;
    }
}
