public class CeilOfArray{

    public static int ceilofanarray(int a[], int target){
        int i =0; int j = a.length-1; int result = -1;
        while(i<=j){
            int mid  = i+(j-i)/2;
            if(a[mid] >= target){
            result = a[mid];
            j=mid-1;        //move left
            }else {
                i = mid+1;     //move right
            }

            
        }
        return result;
    }
    
    public static void main(String[]args){
        int a[] = {2,4,6,8,10};
        int target = 5;
        int ans = ceilofanarray(a, target);
        System.out.println("The ceil of the array will be: " + ans);





    }














}
