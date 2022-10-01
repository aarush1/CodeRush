public class RotateExtraSpace {

    public void rotate(int[] nums, int k) {

        if(k > nums.length){
            k = k % nums.length;
        }
        if(k < 0){
            k = k + nums.length;
        }

        ArrayList<Integer> nw = new ArrayList<>();

        for(int i = nums.length-k;i<nums.length;i++){

            nw.add(nums[i]);

        }

        for(int j = 0;j<=nums.length-k-1;j++){
            nw.add(nums[j]);
        }

        //System.out.print(nw);

        int[] n2 = new int[nw.size()];

        for(int p = 0;p<nums.length;p++){
            n2[p] = nw.get(p);
        }

        for(int q = 0;q<nums.length;q++){
            nums[q] = n2[q];
        }



    }
}
