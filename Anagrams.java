/*Q25. Two strings are anagrams if they contain same characters with same frequency.
 Input : listen, silent
 Output : Anagram
*/

import java.util.*;
public class Anagrams{
public static void main(String [] x){

String str1="listen";
String str2="silent";


char ch1[]=str1.toCharArray();
char ch2[]=str2.toCharArray();

Arrays.sort(ch1);
Arrays.sort(ch2);

      if(Arrays.equals(ch1,ch2)){

         System.out.println("strings are anagrams:"+ch1);

        }
            else {
                     System.out.println("strings are not anagrams");
              }
   }
}
