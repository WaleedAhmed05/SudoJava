package src.l33tc0de;

public class BinarySearch {

    public static int  global_value=0;

    //binary search to find index of target number
    


    public static int search(int[] nums, int target) {



        int mid=nums[nums.length/2];
        int index=nums.length/2-1;
        global_value+=nums.length/2;


        if(mid==target){
            //System.out.println(global_value);
            return global_value;}

        else {




            if(target>=mid && target<=nums[nums.length-1]){
                double num=Math.ceil(nums.length/2f);

                int[] arr = new int[(int) num];
                int counter=0;
                //global_value+=nums.length/2-1;
                for(int i=nums.length/2; i<nums.length; i++){
                    arr[counter]=nums[i];
                    counter++;


                }
                //global_value+=nums.length/2;
                return search(arr, target);
            }

            else if (target<mid && target>=nums[0]){
                int[] arr = new int[nums.length/2];
                int counter=0;
                for(int i=0; i<nums.length/2; i++){
                    //System.out.println(nums[i]);
                    arr[counter]=nums[i];
                    counter++;
                    //global_value++;
                }


                return search(arr, target);
            }

            else {
                return -1;
            }


        }
    }

    public static void main(String args[]){

        int[] test= {-1,0,3,5,9,12,9};
        System.out.println(search(test,0));

        //bug in index 2,5, showing 0;

    }
}