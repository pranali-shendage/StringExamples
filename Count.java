public class Count{
public static void main(String[]x){

  String str="java programming";
   int count=0;
  
   for(int i=0;i<str.length(); i++){
      
      char ch= str.charAt(i);
      
      if(ch!=' '){
        count ++;
       }
    }
    System.out.println(count);
  }
}