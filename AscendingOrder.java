/*Q30. Write a java program to arrange characters in ascending order.
 Input : dcba
 Output : abcd
*/


import java.util.*;
public class AscendingOrder{
public static void main(String []x){

  String str="dcba";
   
   char ch[]= str.toCharArray();
    Arrays.sort(ch);
 
       System.out.print(ch);
   }
}
