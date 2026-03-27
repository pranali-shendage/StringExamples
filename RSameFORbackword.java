/*Q26. Write a java program to check each word separately to see if it reads same forward and backward.
 Input : madam level noon java
 Output : madam level noon
*/




public class RSameFORbackword{
public static void main(String []x){

  String str="madam level noon java";
  String word[]=str.split(" ");
   String rev="";
 for(int i=0; i < word.length;i++){
    char ch=word[i].charAt(i);

    for(int j=word[i].length()-1;j>=0;j--){
        rev= rev + word[i].charAt(j);
     }
   }

    if(word[i].equals(rev)){
   System.out.println(word[i]+" ");

  }
   else {
       System.out.println("read not same");
      } 
  }
}
