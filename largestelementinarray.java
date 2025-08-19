public class largestelementinarray {
    public static int largenumber(int arr[] ){
        int large =arr[0];
        for(int i =1; i<arr.length;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }



return large;
    }




    public static void main(String args[]){
        int arr[]={10,25,3,56,42};
        int ans = largenumber(arr);
        System.out.println("The largest element in the array is: " +ans);

    } 









}

