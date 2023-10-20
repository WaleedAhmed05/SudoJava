package src.AssesmentExams;

import java.util.*;

class Result {

    /*
     * Complete the 'subsetA' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> subsetA(List<Integer> arr) {

        int org_len=arr.size();
        int max_subsetA_len=org_len/2;
        int arr_total_sum=0;
        if(org_len%2==0){
            max_subsetA_len--;
        }

        Collections.sort(arr);

        for(int i=0; i<arr.size(); i++){
            arr_total_sum+=arr.get(i);
        }

        int temp_sum=0;
        int pos=0;
        for(int i=arr.size()-1; i>=0; i--){
            temp_sum+=arr.get(i);

            if(temp_sum>(arr_total_sum/2)){
                pos=i;
                break;
            }
        }
        List<Integer> answer= new ArrayList<>();
        for(int i=pos; i<arr.size(); i++){
            answer.add(arr.get(i));
        }

        return answer;
    }


    public static void main(String args[]){


            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(5);
            arrayList.add(3);
            arrayList.add(2);
            arrayList.add(4);
            arrayList.add(1);
            arrayList.add(2);

            List<Integer> answer=subsetA(arrayList);
            System.out.println(answer);

//            for(int i=0; i<answer.size(); i++){
//
//            }

    }

    }
