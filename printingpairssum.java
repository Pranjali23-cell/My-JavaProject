public class printingpairssum{
    public static void printpairswithsum(int arr[] , int sum){
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr.length; j++){
                if(arr[i]+arr[j] == sum){
                
                System.out.println("("+ arr[i]+","+arr[j] +")");
                }
            }
        }
            System.out.println();

    }
    public static void main(String args[]){
        int arr[] = {3,5,7,1,9};
        int sum =10;
        printpairswithsum(arr, sum);
    }
    
}
