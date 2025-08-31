import java.util.*;
public class bubblesort {
    public static int[] bubblesort(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
           
        }
         return arr;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your array");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the "+ n +"elements:");
        for(int i =0; i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
    
    
     arr=bubblesort(arr);
     System.out.println("Sorted array");
     for(int i =0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }


    
}
}
