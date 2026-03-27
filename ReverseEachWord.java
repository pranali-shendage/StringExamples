/*Q27. Reverse each word but keep word order same.
 Input : Java is fun
 Output : avaJ si nuf
*/

public class ReverseEachWord{
public static void main(String []x){

  String str="Java is fun";
  String word[]=str.split(" ");
   String rev="";
 for(int i=0; i < word.length;i++){
    char ch=word[i].charAt(i);

    for(int j=word[i].length()-1;j>=0;j--){
        rev= rev + word[i].charAt(j);
     }
   }

       System.out.print(rev +"  ");

    }
}
