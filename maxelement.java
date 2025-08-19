public class maxelement {

    public static int maxNumberinArray(int a[]){
             int max = a[0];
             for(int i =0; i<a.length; i++){
                if(a[i]>max){
                    max = a[i];
                }
             }

return max;




    }
    public static void main(String args[]){
        int a[]={10,25,5,78,30};
        int maxElement =maxNumberinArray(a);
        System.out.println("Maximum element in an array:" + maxElement);




    }
    
}
