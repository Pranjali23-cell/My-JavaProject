public class printingtripletsinarray {


    public static void printtriplets( int arr[]){

        for(int i =0; i<arr.length; i++){
            for(int j =i+1; j<arr.length;j++){
                for(int k=j+1; j<arr.length;k++){
                System.out.println("("+ arr[i]+","+arr[j]+ ","+arr[k]+ ")");
            }
            System.out.println();
        }

    }


    }
 public static void main(String args[]){
    int arr[] = {1,2,3,4,5,7,8,9};
    printtriplets(arr);











 }


    
}
