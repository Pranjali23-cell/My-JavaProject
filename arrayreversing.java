public class arrayreversing{
    public static void reversal(int a[]){
        int i = 0;
        int j = a.length-1;
      

        while(i<j){
            int temp =a[i];
            a[i]= a[j];
            a[j] = temp;
            i++;
            j--;


        }


    }

public static void main(String args[]){
int a[]= {1,2,3,4,5};

for(int k = 0; k<a.length ; k++){
    System.out.print(a[k]+" ");
}
reversal(a);
 System.out.println();
for(int k = 0; k<a.length ; k++){
    System.out.print(a[k]+" ");
}






}








}