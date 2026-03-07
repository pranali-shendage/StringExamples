/*Q22. Print only unique characters while maintaining original order.
 Input : banana
 Output : ban

*/


public class UniqueChars {
    public static void main(String[] args) {

        String str = "banana";
        String result = "";  

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

          
            if(result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}