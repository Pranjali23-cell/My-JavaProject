public class binarysearch{
    public static int searchingBinary(int a[], int target){
        //STEP 1 Initialiasation
        int i =0;                  //Start
        int j =a.length-1;         //End

        // STEP 2 Running the loop
        while(i<=j){
        // STEP 3 find the mid
        int mid = (i+j)/2;
        // STEP 4 checking the conditions
        if(a[mid] ==target){
            return mid;
        }else if(a[mid]>target){
            j = mid-1;
        }else{
            i=mid+1;
        }
    }
    return -1;


        }

    public static void main(String args[]){
        int a[]={1,3,5,7,9,11,13};
       int target = 9;
       int result =searchingBinary(a, target);
       if(result !=-1){
            System.out.println("Element found at : "+ result);

       }else{
        System.out.println("Element not found");
       }
    }


}