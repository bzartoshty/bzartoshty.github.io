public class BinarySearch {
   public static void main(String[] args) {
      java.util.Scanner input = new java.util.Scanner(System.in);
      int[] list = {1,3,5,8,10,12,14,20,25,30};
      System.out.println(binarySearchRecursive(list, 20));
   
   } 
   
   public static int binarySearchRecursive(int[] list, int key) {
     return binarySearchRecursive(list,0,list.length-1,key);
   }
   
   // Recursive helper method
   public static int binarySearchRecursive(int[] list, int low, int high, int key) {
    if(low > high) // base case
      return -1;
    int mid = (low+high)/2;
    if(list[mid] == key)  // base case
      return mid;
    else if(key < list[mid]) 
      return binarySearchRecursive(list,low,mid-1,key);
    else
     return binarySearchRecursive(list,mid+1,high,key);
   
   }
   
   
   public static int binarySearch(int[] list, int key) {
    int low = 0, high = list.length-1;
    while (low <= high) {
     int mid = (low+high)/2;
     if(list[mid]==key)
       return mid;
     else if(key < list[mid])
       high = mid -1;
     else
       low = mid + 1;
    }
     return -1; 
   
   }   
      
   
   }

