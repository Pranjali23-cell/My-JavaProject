import java.util.*;
public class secondlargest {
public static int secondlargestnumber(int[]a){
        int max1,max2 = 0; 
        if(a[0]>a[1]){
            max1 = a[0];
            max2 =a[1];

        }else{
            max1 = a[1];
            max2 =a[0];
        }
        for(int i =2; i<a.length; i++){
            if(a[i]>max1){
            max2=max1;
            max1= a[i];
        }else if(a[i]>max2){
            max2 =a[i];

        }
    }
return max2;
        }
    public static void main(String args[]){
        int a[]={5,9,2,11,7};
        int secondnum = secondlargestnumber(a);
        System.out.println("The second largest number is:"+secondnum);
    }
}







// public class SecondlargestEasy {
//     public static void main(String[] args) {
//         int[] numbers = {5, 9, 2, 11, 7};

//         int largest = Integer.MIN_VALUE;      // biggest number
//         int secondLargest = Integer.MIN_VALUE; // second biggest

//         for (int num : numbers) {
//             if (num > largest) {
//                 secondLargest = largest; // old largest becomes 2nd largest
//                 largest = num;           // update largest
//             } 
//             else if (num > secondLargest && num != largest) {
//                 secondLargest = num;     // update second largest
//             }
//         }

//         System.out.println("Second largest number is: " + secondLargest);
//     }
// }






