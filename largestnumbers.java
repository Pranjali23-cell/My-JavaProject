import java.util.*;
public class largestnumbers{
    public static int largenumbers(int numbers[]){
        int largest =Integer.MIN_VALUE;
        for(int i = 0;i<numbers.length;i++ ){
            if(numbers[i]>largest){
            largest =numbers[i];
        }
    }
return largest;
    }


    public static void main(String args[]){
        int numbers[]={3,7,2,11,4};
        int large =largenumbers(numbers);
        System.out.println("Largest number in the array is:"+large);



    }
            

    }
