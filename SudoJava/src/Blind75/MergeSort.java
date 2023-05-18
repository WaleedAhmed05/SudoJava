package src.Blind75;

public class MergeSort {

    public void mergesort(int[] arr){

        if(arr.length>0){
            int[] helper = new int[arr.length];
            mergesort(arr,helper,0,arr.length-1);
        }

    }

    public void mergesort(int[] arr, int[] helper, int low, int high){

        if(low<high){
            int middle = (low+high) / 2 ;
            mergesort(arr,helper,low,middle); // for left array
            mergesort(arr,helper,middle+1,high);  //for right array.
            merge(arr,helper,low,middle,high); //merge arrays.

        }

    }

    public void merge(int[] arr, int[] helper, int low, int mid, int high){

        for(int i=low; i<=high; i++){
            helper[i]=arr[i]; // copy both half into helper array.
        }

        int helperleft =low;
        int helperright=mid+1;
        int current=low;


        while(helperleft<=mid && helperright<=high){ //iterate untill left array is less then mid point and right array is less than high point.

            if(helper[helperleft]<=helper[helperright]){
                arr[current]=helper[helperleft];
                helperleft++;
            }
            else {
                arr[current]=helper[helperright];
                helperright++;
            }
            current++;
        }

        int remaining = mid-helperleft;
        for(int i=0; i<=remaining; i++){
            arr[current+i]=helper[helperleft+1];
        }

    }

}
