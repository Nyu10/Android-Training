class Day2 {
    public int[] searchRange(int[] nums, int target) {
        int [] answer = {-1,-1};
        //target not found {-1,1}
        //iterate through array from left side
        for (int i=0;i<nums.length;i++){
            if (target==nums[i]){
                //if there is target, save the index, break the loop
                answer[0]=i;
                break;
                } 
            }
        //iterate through array from right side
        for (int i=nums.length-1;i>=0;i--){
            if (target==nums[i]){
                //if there is target, save the index, break the loop
                answer[1]=i;
                break;
            }
        }
        //return array
        return answer;
    }
}