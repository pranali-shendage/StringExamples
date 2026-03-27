/*Q24. Write a java program to convert first character of each word to uppercase.
 Input : java is easy
 Output : Java Is Easy
*/

public class FcharUppercase{
public static void main(String [] x){

 String str="java is easy";
 String word[]=str.split(" ");

 String result="";

 for(int i=0 ; i < word.length;i++){
    
   String first=word[i].substring(0,1).toUpperCase();
   String rest=  word[i].substring(1);
   
   result += first + rest +" " ;
 }
   System.out.println("first character of each word to uppercase:" +result);
  
  }
}