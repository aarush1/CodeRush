public class RotateArrayNconstantSpace {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        if(k > len){
            k = k % len;
        }

        if(k < 0){
            k = k + len;
        }

        //Part 1

        reverse(nums,0,nums.length-k-1);

        //Part2

        reverse(nums,nums.length-k,nums.length-1);

        //Part3

        reverse(nums,0,nums.length-1);



        //return ;

    }

    public static int[] reverse(int[] nums,int i,int j){
        int li = i;
        int ri = j;

        while(li < ri){
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;
            li++;
            ri--;
        }


        return nums;
    }
}
