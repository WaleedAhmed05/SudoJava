package src.Blind75;


/*
URL: https://leetcode.com/problems/product-of-array-except-self/
Problem Statement

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

Examples:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]


Constraints:
    2 <= nums.length <= 105
    -30 <= nums[i] <= 30
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.


Solution:
Time complexity: BigO(n) times.
 */
public class ProductOfArrayExceptIteself {


    public int[] productExceptSelf(int[] nums) {
        int total_product = 1;
        int[] return_result = new int[nums.length];
        int zeroCounter=0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {

                total_product *= nums[i];
            }
            else {
                zeroCounter++;
            }

        }




        for (int i = 0; i < return_result.length; i++) {

            if(zeroCounter>1){
                return_result[i] = 0;
            }

            else if(zeroCounter==1){
                if(nums[i]==0){
                    return_result[i]=total_product;
                }
                else {
                    return_result[i]=0;
                }
            }

            else {


                return_result[i] = total_product / nums[i];
            }



        }
        return return_result;
    }


}
