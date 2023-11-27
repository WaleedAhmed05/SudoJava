package src.l33tc0de;

import java.util.List;

public class Minimum_array_length_after_pair_removals {

    public int minLengthAfterRemovals(List<Integer> nums) {


        int result=0;
        boolean restartflag= false;

        int i=0;
        int j=0;
        while(i<nums.size()){


            if(nums.size()>1)
                 j=i+1;



            while(j<nums.size()){

                if(nums.get(i)<nums.get(j)){

                    nums.remove(i);
                    nums.remove(j);
                    restartflag=true;
                    break;
                }

                j++;
            }

            i++;

            if(restartflag){
                i=0;
                j=0;
            }
        }
//        for(int i=0; i<nums.size(); i++){
//
//
//
//            for(int j=0; j<nums.size(); j++){
//
//                if(restartflag){
//                    restartflag=false;
//                    i=0;
//                    j=0;
//                }
//
//                if(nums.size()>1){
//
//                    if(nums.get(i)<nums.get(j)){
//                        nums.remove(i);
//                        nums.remove(j);
//
//                        restartflag=true;
//                        break;
//
//                    }
//
//                }
//                else {
//                    break;
//                }
//            }
//
//
//        }

        result=nums.size();
        return result;

    }
}
