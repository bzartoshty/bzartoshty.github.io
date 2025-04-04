public class Palindrome {
   public static void main(String[] args) {
      java.util.Scanner input = new java.util.Scanner(System.in);
      String s = "A man, a plan a canal Panama";
      String s1 = filter(s).toLowerCase();
      if(isPalindrome(s1))
         System.out.println(s+" is palindrome");
      else
         System.out.println(s+" is not palindrome");
   
   }
   
   public static String filter(String s){
      String s1 ="";
      for(int i=0;i<s.length();++i){
         if(Character.isLetterOrDigit(s.charAt(i)))
            s1 = s1 + s.charAt(i);
      }
      return s1;
   }
   
   public static boolean isPalindrome(String s){
     return isPalindrome(s,0,s.length()-1);
   }
   
   // Helper recursive method
   public static boolean isPalindrome(String s, int low, int high){
    if(high <= low)  // base case
      return true;
    else if(s.charAt(low) != s.charAt(high)) // base case
      return false;
    else
      return isPalindrome(s,low+1,high-1);
   }
     
      
   
   }

