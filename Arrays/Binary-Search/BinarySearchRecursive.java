public class BinarySearchRecursive {

    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        return search2(nums,low,high,target);

    }
    //return -1;
    public static int search2(int[] nums,int low, int high, int target){



        if(low > high){
            return -1;
        }

        int mid = low + (high - low)/2;

        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] > target){
            return search2(nums,low,mid-1,target);
        }

        else if(nums[mid] < target){

            return search2(nums,mid+1,high,target);


        }

        return -1;
    }


}
