public class lastoccurence {
    public static int firstOccurenceQuestion(int a[], int target){
        int i =0;
        int j = a.length -1;
        int result =-1;

        while(i<=j){
             int mid = i+(j-1)/2;
             if(a[mid]==target){
                result =mid;
                i=mid+1;

             }else if(a[mid]<target){
                i= mid+1;              //move right
             }else{
                j=mid-1;
             }

        }

return result;







    }
    public static void main(String args[]){
        int a[] = {1,2,4,4,4,5,6,};
        int target = 4;
        int ans =firstOccurenceQuestion(a, target);
        System.out.println("Last Occurence index = "+ans);

    }
    
}
