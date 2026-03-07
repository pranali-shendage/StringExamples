public class CountVowels{
public static void main(String []x){
  
 String word="java";
 int count=0;

 for(int i=0;i<word.length();i++)
 {
     char ch=word.charAt(i);
   if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
     {
       count ++;
     }
   }
 System.out.println(count);

 }
}