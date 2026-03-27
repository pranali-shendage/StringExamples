/* Q23. Split the string into words and find the word with maximum length.
 Input : Java is very powerful
 Output : powerful */

public class Maximumlength{
public static void main (String []x){

String str=" Java is very powerful";
String word[]= str.split(" ");

String maxword= " ";
for(int i=0;i<str.length();i++){
 
   if(word[i].length() > maxword.length()){
       
        maxword= word[i];
     }
  }
System.out.println("the word with maximum length : "+maxword);

 }
}



