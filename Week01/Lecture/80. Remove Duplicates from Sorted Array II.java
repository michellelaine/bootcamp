/* 80. Remove Duplicates from Sorted Array II

Follow up for "Remove Duplicates":
What if duplicates are allowed at most twice?

For example,
Given sorted array nums = [1,1,1,2,2,3],

Your function should return length = 5, with the first five elements of nums 
being 1, 1, 2, 2 and 3. It doesn't matter what you leave beyond the new length.
*/

public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int start = 2;
        for(int end = 2; end < nums.length; end++) {
            if(nums[end] != nums[start - 2]){
                nums[start] = nums[end];
                start++;
            }
        }
        return start;
    }
