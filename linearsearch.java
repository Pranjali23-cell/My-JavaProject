import java.util.*;
public class linearsearch{
  public static int linearSearch(String names[] , String key){
    for(int i =0; i<names.length; i++){
      if(names[i].equals(key)){
      return i;
    }
  }
  return -1;
}
  public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 String names[]={"Alice", "Bob","Charlie","David","Eve"};
 System.out.println("Enter the name");
 String key = sc.nextLine();
 int index = linearSearch(names, key);
 if(index == -1){
  System.out.println("Element not found");
 }else{
  System.out.println("Element found at:"+index);
 }
 sc.close();
  }
}