public class Solution {

    int found;
    public int searchInsert(int[] nums, int target) {

        for(int i=0;i<nums.length;i++){

            if(nums[i] == target){
                int temp = i;
                i=found;
                found=temp;
            }
        }
        return found;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[]num = new int[]{1,2,3};
        int target=2;
        System.out.println(s.searchInsert(num,target));
    }
}
