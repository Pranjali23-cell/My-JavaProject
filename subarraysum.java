public class subarraysum{
    public static int printsumofarray(int arr[],int k){
        int count = 0;
        for(int i =0; i<arr.length;i++){
            int sum =0;
            for(int j =i; j<arr.length;j++){
                sum+= arr[j];
                if(sum ==k){
                    count++;
                }
                }
            
            }
        
return count;
    }
    public static void main(String args[]){
        int arr[]={4,2,-1,3,6,1,-2,5};
        int k =10;
        int ans = printsumofarray(arr, k);
        System.out.println("The total number count is :"+ans);
    }
}