public class minelement {
    public static int minimumElement(int a[]){
        int min = a[0];
        for(int i =1; i<a.length; i++){
            if (a[i]<min){
                min = a[i];

            }
        }


return min;

    } 
    public static void main(String args[]){
        int a[] = {12,4,19,33,2,45};
        int minimum = minimumElement(a);
        System.out.println("Smallest element in the array is:"+minimum);

    }
    
}
