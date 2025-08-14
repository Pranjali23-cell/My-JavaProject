public class thirdlargest {
    //function to find the thirdlargest number
    public static int thirdLargestNumber(int numbers[]){

    // STEP 1 - Initializing with the smallest possible values
    int largest =Integer.MIN_VALUE;
    int secondlargest =Integer.MIN_VALUE;
    int thirdlargest = Integer.MIN_VALUE;

    //STEP 2 - Loop through each number
    for(int i =0; i<numbers.length;i++){
        int num = numbers[i];
    
    //STEP 3 - If the numbmer is bigger than largest
    if(num > largest){
        thirdlargest = secondlargest;
        secondlargest = largest;
        largest = num;
    }
    // STEP 4 - If the number is bigger than second largest
     else if(num>secondlargest && num!=largest) {
        thirdlargest= secondlargest;
        secondlargest=num;
    }
    // STEP 5 - If the number is bigger than thirdlargest 
    else if(num>thirdlargest && num!=secondlargest && num!=largest){
        thirdlargest =num;
    }
    
}
if(thirdlargest==Integer.MIN_VALUE){
    return -1;
}
return thirdlargest;
    }
    public static void main(String args[]){
    int numbers[]={5,9,2,11,7};
    int result =thirdLargestNumber(numbers);
    if(result==-1){
        System.out.println("Not enough distinct numbers in the array");

    }else{
        System.out.println("The third largest number is:"+result);
    }

    }
    
}
