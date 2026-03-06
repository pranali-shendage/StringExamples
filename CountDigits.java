/*Q15. Count digits in a string

Input: abc123
Output: 3

*/


public class CountDigits {
    public static void main(String[] args) {

        String str = "abc123";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(Character.isDigit(ch)) {
                count++;
            }
        }

        System.out.println("Digits count = " + count);
    }
}