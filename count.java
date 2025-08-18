public class count {

 public static int firstoccurenceCount(int a[], int target){
    int i =0; int j = a.length-1; int result = -1; 
     // first occurence
     while(i<=j){
        int mid  = i+(j-i)/2;
        if(a[mid]==target){
            result = mid;
            j = mid-1;       //move left
        }else if(a[mid]<target){
            i = mid+1;       //move right
        }else{
            j=mid-1;         //move left
        }
    }
    return result;
 }

 public static int lastOccurenceCount(int a[], int target){
    int i =0; int j =a.length-1; int result2 =- 1;
        while( i<=j){
            int mid  = i+(j-i)/2;
            if(a[mid]==target){
            result2 = mid;
            i = mid+1;                // move right
            }else if(a[mid]>target){
                j = mid-1;            //move left
            }else{
                i= mid+1;             // move right
            }

          

        }
     return result2;

    }
 




    public static void main(String args[]){
        int a[]= {1,2,2,2,3,4,5};
        int target = 2;
        int ans = firstoccurenceCount(a, target);
        int ans2 = lastOccurenceCount(a, target);
        int count = ans2-ans+1;
        System.out.println("The times of coccurence is "+ count);




    }
    
}
